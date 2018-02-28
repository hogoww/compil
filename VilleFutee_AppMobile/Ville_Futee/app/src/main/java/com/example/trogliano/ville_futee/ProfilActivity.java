package com.example.trogliano.ville_futee;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.Toast;


public class ProfilActivity extends AppCompatActivity {

    public static final String PREFS_NAME1 = "VILLE_PREF";
    public static final String PREFS_NAME2 = "PREF_PREFS";
    SharedPreferences settings;

    public void clearVille(){
        settings=getBaseContext().getSharedPreferences(PREFS_NAME1, Context.MODE_PRIVATE);
        settings.edit().clear();
    }

    public void clearPrefs(){
        settings=getBaseContext().getSharedPreferences(PREFS_NAME2, Context.MODE_PRIVATE);
        settings.edit().clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);

        final Button buttonFav = (Button) findViewById(R.id.favourites_button);
        buttonFav.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent act_fav = new Intent(ProfilActivity.this, FavouritesActivity.class);
                startActivity(act_fav);
            }
        });

        final Button buttonModif = (Button) findViewById(R.id.profil_modif_button);
        buttonModif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent act_modif = new Intent(ProfilActivity.this, ModifProfilActivity.class);
                startActivity(act_modif);
            }
        });

        final Button buttonVille = (Button) findViewById(R.id.select_city_button);
        buttonVille.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent act_SelectCity = new Intent(ProfilActivity.this, SelectCityActivity.class);
                startActivity(act_SelectCity);
            }
        });

        final Button buttonSupp = (Button) findViewById(R.id.supp_pref_button);
        buttonSupp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                clearVille();
                clearPrefs();
                Toast.makeText(getBaseContext(), "Done", Toast.LENGTH_LONG).show();
            }
        });

        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_profil);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });

    }
}