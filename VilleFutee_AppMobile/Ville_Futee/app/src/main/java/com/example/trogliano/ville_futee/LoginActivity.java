package com.example.trogliano.ville_futee;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.concurrent.ExecutionException;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private Button login, register;
    private EditText etEmail, etPass;
    //private DbHelper db;
    //private Session session;
    EditText nom, mdp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     //   db = new DbHelper(this);
     //   session = new Session(this);
        login = (Button)findViewById(R.id.btn_login);
        // A COMPLETER
        // register = (Button)findViewById(R.id.btnReg);
        etEmail = (EditText)findViewById(R.id.et_login);
        etPass = (EditText)findViewById(R.id.et_mdp);
      //  register.setOnClickListener(this);

     /*   if(session.loggedin()){
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
            finish();
        }*/
    // }

    login.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {

                    nom = (EditText) findViewById (R.id.et_login);
                    mdp = (EditText) findViewById (R.id.et_mdp);
                    String getLog = nom.getText().toString();
                    String getMdp = mdp.getText().toString();

            if(getMdp.length()>30 || getLog.length()>30) {
                Toast.makeText(getApplicationContext(), "Pseudo ou mot de passe trop long (>30caractères).", Toast.LENGTH_LONG).show();

            }

            else {
                String result = "";

                try {
                    Id logs = new Id(getLog, getMdp);
                    result = new ConnectSocket().execute(logs).get();
                            //.execute(idmdp).get();
                    //result="1";
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

                if (result.trim().equals("1")) {
                    Intent myintent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(myintent);
                } else {

                    Toast.makeText(getApplicationContext(), "Mauvaise combinaison de pseudo et mot de passe.", Toast.LENGTH_LONG).show();


                }
            }

        }
        });
    }
    }

   /* public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_login:
                login();
                break;
            // A COMPLETER
            // case R.id.btnReg:
            //   startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
            // break;
            default:

    private void login(){
        String email = etEmail.getText().toString();
        String pass = etPass.getText().toString();

        if(db.getUser(email,pass)){
            session.setLoggedin(true);
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(), "Wrong email/password",Toast.LENGTH_SHORT).show();
        }
    }
}
*/