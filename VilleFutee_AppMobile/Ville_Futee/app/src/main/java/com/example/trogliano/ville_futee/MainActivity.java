package com.example.trogliano.ville_futee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    protected void HomeLayout(){
        setContentView(R.layout.activity_main);

        final Button buttonVille = (Button) findViewById(R.id.buttonVille);
        buttonVille.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent act_ville = new Intent(MainActivity.this, VilleActivity.class);
                startActivity(act_ville);
            }
        });

        final Button buttonProfil = (Button) findViewById(R.id.buttonProfil);
        buttonProfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent act_profil = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(act_profil);
            }
        });

        final Button buttonAlertes = (Button) findViewById(R.id.buttonAlertes);
        buttonAlertes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent act_alertes = new Intent(MainActivity.this, AlerteActivity.class);
                startActivity(act_alertes);
            }
        });

        final Button buttonReseaux = (Button) findViewById(R.id.buttonReseaux);
        buttonReseaux.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent act_reseaux = new Intent(MainActivity.this, AccueilReseau.class);
                startActivity(act_reseaux);
            }
        });

        final Button buttonCommerce = (Button) findViewById(R.id.buttonCommerce);
        buttonCommerce.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent act_commerce = new Intent(MainActivity.this, CommerceActivity.class);
                startActivity(act_commerce);
            }
        });


    }

   /* protected void BackButton() {
        final ImageButton buttonBackHome = (ImageButton) findViewById(R.id.back_button_home);
        buttonBackHome.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                setContentView(R.layout.activity_main);
                HomeLayout();
            }
        });

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HomeLayout();

    }
}
