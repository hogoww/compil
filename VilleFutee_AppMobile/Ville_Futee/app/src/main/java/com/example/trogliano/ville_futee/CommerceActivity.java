package com.example.trogliano.ville_futee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.content.SharedPreferences;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;


public class CommerceActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private static final String PREFS = "commerce_prefs";
    private static final String PREFS_COM = "PREFS_COM";
    private static final String PREFS_ADR = "PREFS_ADR";
    private static final String PREFS_HOR = "PREFS_HOR";
    private static final String PREFS_DESC = "PREFS_DESC";

    protected void CommerceInteraction() {
        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button_main_commerce);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                finish();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        setContentView(R.layout.activity_commerce);

        CommerceInteraction();

        LinearLayout commerceList = (LinearLayout) findViewById(R.id.listCommerce);
        commerceList.removeAllViewsInLayout();

        //REQUÊTE SUR L'ENSEMBLE DES COMMERCES DONT L'UTILISATEUR A COCHE LE CENTRE D'INTERET

        //REMPLACER 2 PAR SHAREDPREFERENCE UTILISATEUR EN COURS
        AffCommerce user= new AffCommerce(2);

        String result = "";

  /*      try {
            result = new CommercSocket().execute(user).get();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
*/

        result="AndroidEn1Clic|123, rue ABC 34090 Montpellier|Votre appli android en 1clic|ouvert du lundi au vendredi de 9h à 9h05 \n";
        result+="AndroidEn2Clic|234, rue BCD 34090 Montpellier|Votre appli android en 2clics|ouvert du lundi au mercredi de 12h à 14h00 \n";

        String[] lesCommerces = result.split("\\n");

        final ArrayList<ArrayList<String>> comList = new ArrayList<ArrayList<String>>();
        ArrayList<String> attr;

        for(int z=0; z < lesCommerces.length; z++){

            String[] tmp=lesCommerces[z].split("\\|");

            attr= new ArrayList<String>();
            attr.add(0,tmp[0]);
            attr.add(1,tmp[1]);
            attr.add(2,tmp[2]);
            attr.add(3,tmp[3]);
            comList.add(z,attr);

        }

       /*
        for(int i=0; i < 20 ; i++) {
            attr= new ArrayList<String>();
            attr.add(0,"Commerce "+i);
            attr.add(1,"Adresse "+i);
            attr.add(2,"Ouverture "+i);
            attr.add(3,"Description "+i);
            comList.add(i,attr);
        }
*/
        final Button[] listButton = new Button[comList.size()];

        //La variable param servant à paramétrer les checkboxs
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;


        for (int i=0 ; i < comList.size(); i++){
            final int a = i;
            listButton[i]= new Button(this);
            listButton[i].setText(comList.get(i).get(0));
            listButton[i].setBackgroundResource(R.drawable.emptybutton);
            listButton[i].setMinHeight((int) (70 * scale + 0.5f));
            commerceList.addView(listButton[i],params);
            listButton[i].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Perform action on click
                    Intent act_commerce = new Intent(CommerceActivity.this, PageCommerceActivity.class);
                    String s = comList.get(a).get(0);
                    //act_commerce.putExtra("STRING_I_NEED",s);
                    sharedPreferences
                            .edit().putString(PREFS_COM,s).apply();
                    sharedPreferences
                            .edit().putString(PREFS_ADR,comList.get(a).get(1)).apply();
                    sharedPreferences
                            .edit().putString(PREFS_HOR,comList.get(a).get(2)).apply();
                    sharedPreferences
                            .edit().putString(PREFS_DESC,comList.get(a).get(3)).apply();
                    startActivity(act_commerce);
                }
            });
        }
    }
}