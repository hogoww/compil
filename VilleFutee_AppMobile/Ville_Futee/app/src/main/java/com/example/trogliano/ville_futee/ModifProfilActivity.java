package com.example.trogliano.ville_futee;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class ModifProfilActivity extends AppCompatActivity {
    EditText nom, desc, mdp, mdpTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil_modif);

        nom = (EditText) findViewById (R.id.new_name);
        desc = (EditText) findViewById (R.id.new_desc);
        mdp = (EditText) findViewById (R.id.old_pass);
        mdpTest = (EditText) findViewById (R.id.new_pass);

        (findViewById(R.id.save_button_profil)).setOnClickListener //récupération des modifications puis envoie au serveur
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        /*
                        // Affichage test
                        String chaine = nom.getText().toString()+" "+desc.getText().toString()+" "+mdp.getText().toString();
                        Toast.makeText(ModifProfilActivity.this, chaine, Toast.LENGTH_LONG).show();
                        */
                        String oldPwd = mdpTest.getText().toString();
                        String newPwd = mdp.getText().toString();
                        String newName = nom.getText().toString();
                        String newDesc = nom.getText().toString();

                        if( oldPwd !=null && newPwd !=null){

                            //Envoie de cette valeur au serveur pour vérifier si l'ancien est correcte

                            if(/* oldpwd is correct */true){
                                //On envoie oldPwd,newPwd
                            }
                            else{
                                Toast.makeText(ModifProfilActivity.this, "Erreur : mauvais mot de passe",Toast.LENGTH_LONG).show();
                                // Eventuellement essayer de mettre la case ancien mot de passe en surbrillance rouge
                            }
                        }
                        if ( newName !=null){
                                //On envoie newName
                        }
                        if (newDesc != null){
                                //On envoie newDesc
                        }
                    }
                });


        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_profilmodif);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });
    }
}