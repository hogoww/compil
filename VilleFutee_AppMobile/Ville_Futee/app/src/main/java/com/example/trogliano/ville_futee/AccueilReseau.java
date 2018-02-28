package com.example.trogliano.ville_futee;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;

public class AccueilReseau extends AppCompatActivity {

        protected void ReseauxInteraction() {
            final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_main_reseau);
            buttonBack.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Perform action on click
                    finish();
                }
            });


            //*********************A MODIFIER ET CREER LES LAYOUT DE CHACUN ***********************//

            final Button mesReseaux = (Button) findViewById(R.id.last_public_button);
            mesReseaux.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent reseaux = new Intent(AccueilReseau.this, LastPubliActivity.class);
                    startActivity(reseaux);
                }
            });

            final Button parcourReseau = (Button) findViewById(R.id.mes_reseaux_button);
            parcourReseau.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent mesReseaux = new Intent(AccueilReseau.this, MesReseaux.class);
                    startActivity(mesReseaux);
                }
            });
/*
            final ImageButton creerReseau = (ImageButton) findViewById(R.id.back_button_main_reseau);
            creerReseau.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent creerR = new Intent(AccueilReseau.this, LastPubliActivity.class);
                    startActivity(creerR);
                }
            });
            */
            //****************************************************************************************//

        }


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.parametre_reseau);
            ReseauxInteraction();

        }
}

