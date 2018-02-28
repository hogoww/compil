package com.example.trogliano.ville_futee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.SharedPreferences;



public class PageCommerceActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    private static final String PREFS = "commerce_prefs";
    private static final String PREFS_COM = "PREFS_COM";
    private static final String PREFS_ADR = "PREFS_ADR";
    private static final String PREFS_HOR = "PREFS_HOR";
    private static final String PREFS_DESC = "PREFS_DESC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        sharedPreferences = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);

        String name = sharedPreferences.getString(PREFS_COM, null);
        String adr = sharedPreferences.getString(PREFS_ADR, null);
        String ouverture = sharedPreferences.getString(PREFS_HOR, null);
        String description = sharedPreferences.getString(PREFS_DESC, null);
        //**********************************RECUPERATION DE LA VALEUR ENVOYEE **************************************/
        /*String name;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                name= null;
            } else {
                name= extras.getString("STRING_I_NEED");
            }
        } else {
            name= (String) savedInstanceState.getSerializable("STRING_I_NEED");
        }*/
        //*********************************************************************************************************/


        final LinearLayout page_commerce = new LinearLayout(this);
        page_commerce.setOrientation(LinearLayout.VERTICAL);



        final LinearLayout bandeau = new LinearLayout(this);
        final LinearLayout contenu = new LinearLayout(this);

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;

        LinearLayout.LayoutParams contenuParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. WRAP_CONTENT , LinearLayout.LayoutParams. WRAP_CONTENT );
        LinearLayout.LayoutParams bandeauParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

       //*****************************************CREATION DU BANDEAU*****************************************//
        bandeau.setOrientation(LinearLayout.HORIZONTAL);
        bandeau.setBackgroundResource(R.color.colorPrimary);
        bandeau.setMinimumHeight((int) (50 * scale + 0.5f));

        LinearLayout.LayoutParams bandeauParams1 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. WRAP_CONTENT , LinearLayout.LayoutParams. WRAP_CONTENT );
        LinearLayout.LayoutParams bandeauParams2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );
        bandeauParams1.gravity = Gravity.CENTER;
        bandeauParams2.gravity = Gravity.CENTER;

        final ImageButton back_button = new ImageButton(this);
        //AJOUTER L'IMAGE DU BACK BUTTON
        back_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });

         bandeau.addView(back_button,bandeauParams1);

        final TextView nomCommerce = new TextView(this);
        nomCommerce.setText(name);
        nomCommerce.setGravity(17);
        nomCommerce.setTextSize(20);

        bandeau.addView(nomCommerce,bandeauParams2);
        page_commerce.addView(bandeau,bandeauParams);

        //*****************************************CREATION DU CONTENU*****************************************//

        contenu.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams contenuParamsItem = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        final  TextView adresse = new TextView(this);
        final  TextView adrE = new TextView(this);
        final  TextView horaire = new TextView(this);
        final  TextView horE = new TextView(this);
        final  TextView desc = new TextView(this);
        final  TextView descE = new TextView(this);

        adresse.setTextSize(20);
        horaire.setTextSize(20);
        desc.setTextSize(20);

        adresse.setPadding((int) (10 * scale + 0.5f),(int) (30 * scale + 0.5f),0,0);
        horaire.setPadding((int) (10 * scale + 0.5f),(int) (30 * scale + 0.5f),0,0);
        desc.setPadding((int) (10 * scale + 0.5f),(int) (30 * scale + 0.5f),0,0);

        adrE.setPadding((int) (10 * scale + 0.5f),0,0,0);
        horE.setPadding((int) (10 * scale + 0.5f),0,0,0);
        descE.setPadding((int) (10 * scale + 0.5f),0,0,0);

        adrE.setTextSize(15);
        horE.setTextSize(15);
        descE.setTextSize(15);

        adresse.setText("Adresse :");
        horaire.setText("Heures d'ouverture :");
        desc.setText("Description :");

        // ICI IL FAUT FAIRE UNE REQUETE AU SERVEUR POUR AVOIR LA DESCRIPTION,LES HEURES ET L'ADRESSE EN FONCTION DU NOM DU COMMERCE
        adrE.setText(adr);
        horE.setText(ouverture);
        descE.setText(description);
        // ICI IL FAUT FAIRE UNE REQUETE AU SERVEUR POUR AVOIR LA DESCRIPTION,LES HEURES ET L'ADRESSE EN FONCTION DU NOM DU COMMERCE

        contenu.addView(adresse,contenuParamsItem);
        contenu.addView(adrE,contenuParamsItem);
        contenu.addView(horaire,contenuParamsItem);
        contenu.addView(horE,contenuParamsItem);
        contenu.addView(desc,contenuParamsItem);
        contenu.addView(descE,contenuParamsItem);

        page_commerce.addView(contenu,contenuParams);

        setContentView(page_commerce);


        //CommerceInteraction();
    }
}