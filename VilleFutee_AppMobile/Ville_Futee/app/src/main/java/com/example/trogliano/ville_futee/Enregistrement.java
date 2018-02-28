package com.example.trogliano.ville_futee;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Enregistrement extends AppCompatActivity {


    public int requete(){
        return 0;
    }


    protected void EnregistrementInteraction() {

        final EditText mdp = (EditText) findViewById(R.id.etMdp);
        final EditText mdp2 = (EditText) findViewById(R.id.etMdp2);

        final Button button = (Button) findViewById(R.id.buttonRegister);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            if(!mdp.getText().toString().equals(mdp2.getText().toString())){
                Toast.makeText(getBaseContext(), "Mots de passe different", Toast.LENGTH_LONG).show();
            }
            else{
                int retourRequete = 0;
                retourRequete=requete();
                switch(retourRequete) {
                    case 0:
                        Intent act_buttonPrefMap = new Intent (Enregistrement.this, LoginActivity.class);
                        startActivity(act_buttonPrefMap);
                        break;
                    case 1:
                        Toast.makeText(getBaseContext(), "Pseudonyme existant", Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(getBaseContext(), "Email existant", Toast.LENGTH_LONG).show();
                    default:
                        Toast.makeText(getBaseContext(), "Les lutins voleurs de données sont passés par là", Toast.LENGTH_LONG).show();
                }

            }

            }
        });

    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        EnregistrementInteraction();
    }
}