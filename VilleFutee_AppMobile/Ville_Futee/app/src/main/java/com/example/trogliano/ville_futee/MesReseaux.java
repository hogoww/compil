package com.example.trogliano.ville_futee;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.content.SharedPreferences;

import java.util.ArrayList;


public class MesReseaux extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private static final String PREFS = "reseaux_prefs";
    private static final String PREFS_RES = "PREFS_RES";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        setContentView(R.layout.mes_reseaux);

        LinearLayout mesReseauxList = (LinearLayout) findViewById(R.id.mes_reseaux_list);
        mesReseauxList.removeAllViewsInLayout();

        //REQUÊTE SUR L'ENSEMBLE DES RESEAUX DONT L'UTILISATEUR FAIT PARTI

        //Imaginons une liste de string pour les noms des réseaux

        final ArrayList<String> reseauxList = new ArrayList<String>();

        for(int i=0; i < 20 ; i++) {;
            reseauxList.add(i,"Réseau "+i);
        }

        final Button[] listButton = new Button[reseauxList.size()];

        //La variable param servant à paramétrer les checkboxs
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;


        for (int i=0 ; i < reseauxList.size(); i++){
            final int a = i;
            listButton[i]= new Button(this);
            listButton[i].setText(reseauxList.get(i));
            listButton[i].setBackgroundResource(R.drawable.emptybutton);
            listButton[i].setMinHeight((int) (70 * scale + 0.5f));
            mesReseauxList.addView(listButton[i],params);
            listButton[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Perform action on click
                    Intent page_reseau = new Intent(MesReseaux.this, PageReseauActivity.class);
                    String s = reseauxList.get(a);

                   sharedPreferences.edit().putString(PREFS_RES,s).apply();

                    startActivity(page_reseau);
                }
            });
        }

        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_mes_reseaux);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });
    }
}