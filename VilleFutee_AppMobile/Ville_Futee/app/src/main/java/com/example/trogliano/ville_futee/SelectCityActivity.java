package com.example.trogliano.ville_futee;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SelectCityActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "VILLE_PREF";
    SharedPreferences settings;
    Gson gson = new Gson();
    private List<String> ciList;

    private RadioGroup cityList;


    public void saveChangeVille(){
        ciList.add("Ajouter Ville");
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String jsonListeVille = gson.toJson(ciList);
        settings.edit().putString("MES_VILLES", jsonListeVille).apply();
    }

    public void saveIndexVille(int index){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        settings.edit().putInt("MON_CHOIX", index).apply();
    }

    public int getIndexVille(){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return settings.getInt("MON_CHOIX", -1);
    }

    public List<String> recupListVille(){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
        if (settings.contains("MES_VILLES")) {
            String jsonListeVille = settings.getString("MES_VILLES", null);
            Gson gson = new Gson();
            String[] mesVilles = gson.fromJson(jsonListeVille,
                    String[].class);
            ciList = Arrays.asList(mesVilles);
            ciList = new ArrayList<String>(ciList);
        }
        if(ciList == null || ciList.isEmpty()){
            ciList = new ArrayList<String>();
            ciList.add("Marseille");
            ciList.add("Montpellier");
            ciList.add("Paris");
            ciList.add("Ajouter ville");
        }
        else {
            ciList.remove(ciList.size()-1);
        }
        return ciList;
    }

    public void radioGroupRefresh(){
        //On vide le layout de tous ses composants afin de le remplir dynamiqueement par la suite
        cityList.removeAllViewsInLayout();

        //Requête au serveur sur la liste des villes d'un utilisateur
        //Requête au serveur sur la ville sélectionnée par l'utilisateur

        //Disons que nous recevons une ArrayList<String>
        //
        //la liste dans laquelle on va ranger tous les villes

        // ciList = listReçue ;

        //Récupération des villes enregistrées
        recupListVille();

        //Le tableau de checkbox à placer dans le layout
        final RadioButton[] listVille = new RadioButton[ciList.size()];
        final RadioButton newC = new RadioButton(this);

        //La variable param servant à paramétrer les checkboxs
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;

        for (int i=0; i < ciList.size(); i++){
            //Si ville à ajoutée = ville sélectionnée alors on ajoute radioGroup.check(i);
            listVille[i]= new RadioButton(this);
            listVille[i].setText(ciList.get(i));
            //listVille[i].setChecked(true);
            listVille[i].setMinHeight((int) (50 * scale + 0.5f));
            cityList.addView(listVille[i],i,params);
            cityList.check(i+1);
        }

        cityList.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                int selectedId = cityList.getCheckedRadioButtonId();
                View radioButton = cityList.findViewById(selectedId);
                int idx = cityList.indexOfChild(radioButton);
                saveIndexVille(idx);
                Toast.makeText(getBaseContext(), "Choix pris en compte", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void cityInteraction(){
        //on rend invisible la saisie de texte
        final LinearLayout ll1 = (LinearLayout) findViewById(R.id.ajoutVille);
        ll1.setVisibility(View.INVISIBLE);

        //init du radiogroup
        cityList = (RadioGroup) findViewById(R.id.city_selection_layout);
        radioGroupRefresh();


        final Button buttonSave = (Button) findViewById(R.id.ok_button_city);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final EditText newCity = (EditText) findViewById((R.id.new_city));
                int size=ciList.size();
                int i=0;
                for(i=0; i<size-1; i++) {
                    int compare = ((String) ciList.get(i)).compareTo(newCity.getText().toString());
                    if (compare > 0) {
                        break;
                    }
                }
                ciList.add(i, newCity.getText().toString());
                saveChangeVille();
                radioGroupRefresh();
                InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                mgr.hideSoftInputFromWindow(newCity.getWindowToken(), 0);
                //On envoie la nouvelle ville au serveur + on la sélectionne
                Toast.makeText(getBaseContext(), newCity.getText().toString()+" a été ajouté.", Toast.LENGTH_LONG).show();
                ll1.setVisibility(View.INVISIBLE);
            }
        });

        final Button buttonAjoutVille = (Button) findViewById(R.id.AjouterVille);
        buttonAjoutVille.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                ll1.setVisibility(View.VISIBLE);
            }
        });

        final Button buttonEnleverVille = (Button) findViewById(R.id.EnleverVille);
        buttonEnleverVille.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int selectedId = cityList.getCheckedRadioButtonId();
                View radioButton = cityList.findViewById(selectedId);
                int idx = cityList.indexOfChild(radioButton);
                if (idx == getIndexVille()){
                    saveIndexVille(0);
                }
                RadioButton r = (RadioButton) cityList.getChildAt(idx);
                String selectedtext = r.getText().toString();
                if((selectedId) > 0) {
                    ciList.remove(ciList.indexOf(selectedtext));
                    saveChangeVille();
                    radioGroupRefresh();
                }else{
                    Toast.makeText(getBaseContext(), "Nothing to remove", Toast.LENGTH_LONG).show();
                }
            }
        });



        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_citySelect);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.city_selection);
        cityInteraction();
    }

}