package com.example.trogliano.ville_futee;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FavouritesActivity extends AppCompatActivity {

    public static final String PREFS_NAME = "PREF_PREFS";
    SharedPreferences settings;
    Gson gson = new Gson();
    private List<String> ciList;

    private List<String> checked;

    public List<String> recupListPref(){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
        if (settings.contains("MES_PREFS")) {
            String jsonListePref = settings.getString("MES_PREFS", null);
            Gson gson = new Gson();
            String[] mesPrefs = gson.fromJson(jsonListePref,
                    String[].class);
            checked = Arrays.asList(mesPrefs);
            checked = new ArrayList<String>(checked);
        }
        return checked;
    }

    public void saveChangePref(){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String jsonListePref = gson.toJson(checked);
        settings.edit().putString("MES_PREFS", jsonListePref).apply();
    }

    //à modifier pour récupérer la liste du serveur
    public void listeInit() {
            ciList = new ArrayList<String>();
            ciList.add("Voitures de sport");
            ciList.add("Voitures de tourisme");
            ciList.add("Voitures de ville");
            checked = new ArrayList<String>();
            checked=ciList;
    }

    public void favoritesInteraction() {
        refreshCheckbox();
    }

    public void refreshCheckbox(){
        //On vide le layout de tous ses composants afin de le remplir dynamiqueement par la suite
        LinearLayout cbList = (LinearLayout) findViewById(R.id.checkboxList);
        cbList.removeAllViewsInLayout();

        //Requête au serveur sur la liste complète de tous les types de commerces existants
        //Disons que nous recevons une ArrayList<String>

        //la liste dans laquelle on va ranger tous les centres d'intérêts
        listeInit();
        recupListPref();
        //Le tableau de checkbox à placer dans le layout
        final CheckBox[] listCheckBox = new CheckBox[ciList.size()];

        //La variable param servant à paramétrer les checkboxs
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;

        for (int i=0 ; i < ciList.size(); i++){
            listCheckBox[i]= new CheckBox(this);
            listCheckBox[i].setText(ciList.get(i));
            settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
            if (settings.contains("MES_PREFS")) {
                if(checked.get(i).equals("y")) {
                    listCheckBox[i].setChecked(true);
                }
            }
            listCheckBox[i].setMinHeight((int) (50 * scale + 0.5f));
            cbList.addView(listCheckBox[i],params);
        }

        final Button buttonSave= (Button) findViewById(R.id.save_button_favourites);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int i=0;
                for(i=0 ; i < ciList.size() ; i++){
                    if(listCheckBox[i].isChecked()){
                        //On envoie l'info au serveur
                        //Sinon on ajoute à une structure contenant le centre d'intérêt et le booléen pour envoyer d'un coup à la fin
                        checked.set(i,"y");
                    }
                    else{
                        //On envoie l'info au serveur
                        //Sinon on ajoute à une structure contenant le centre d'intérêt et le booléen pour envoyer d'un coup à la fin
                        checked.set(i,"n");
                    }
                }
                saveChangePref();
                finish();
                //Si on a utilisé une structure on l'envoie
            }
        });

        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_fav);
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
        setContentView(R.layout.favourites);
        favoritesInteraction();
    }
}