package com.example.trogliano.ville_futee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class LastPubliActivity extends AppCompatActivity {

    protected void ReseauxInteraction() {
        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button);
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
        setContentView(R.layout.last_publication);

        ReseauxInteraction();

        //Requête sur l'ensemble des publications des réseaux auquel l'utilisateur appartient rangées par odre temporel
        // Le nom du réseau, l'auteur de la publication, et le contenu

        final ArrayList<String> reseau = new ArrayList<String>();
        final ArrayList<String> auteur = new ArrayList<String>();
        final ArrayList<String> contenu = new ArrayList<String>();

        LinearLayout lastpubList = (LinearLayout) findViewById(R.id.last_public_list);
        lastpubList.removeAllViewsInLayout();

        //********************(SIMULATION D'UNE RECEPTION)**************************//
        //Pour chaque publication :
        for(int i=0 ; i < 11 ; i ++){
            reseau.add(i,"Reseau "+i);
            auteur.add(i,"Auteur "+i);
            contenu.add(i,"Ici vient le contenu de la publication de l'auteur dans titre de la publication et elle apparait sur le réseau contenu dans le titre également.");
        }
        //********************(****************************************************//

        //Les différents éléments servants à la fabrication de chaque publication
        LinearLayout[] listPublications = new LinearLayout[reseau.size()];
        TextView[] listReseau = new TextView[reseau.size()];
        TextView[] listContenu = new TextView[reseau.size()];

        //La variable param servant à paramétrer les checkboxs
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;

        //Boucle de construction
        for(int i=0; i < reseau.size() ; i++){

            //Le layout contenant les champs de texte
            listPublications[i] = new LinearLayout(this);
            listReseau[i] = new TextView(this);
            listContenu[i] = new TextView(this);
            listPublications[i].setOrientation(LinearLayout.VERTICAL);
            listPublications[i].setMinimumHeight((int) (50 * scale + 0.5f));
            if(i%2==0)
                listPublications[i].setBackgroundColor(0xFFD6D6D6);
            listPublications[i].setPadding(0,(int) (10 * scale + 0.5f),0,(int) (10 * scale + 0.5f));

            //Les différents champs de textes
            listReseau[i].setText(auteur.get(i) + " dans " + reseau.get(i)+" :");
            listReseau[i].setTextSize(16);
            listReseau[i].setTextColor(0xFF000000);
            listContenu[i].setText(contenu.get(i));
            listContenu[i].setTextSize(14);
            listContenu[i].setTextColor(0xFF111111);

            //Ajout des éléments
            listPublications[i].addView(listReseau[i],params);
            listPublications[i].addView(listContenu[i],params);
            lastpubList.addView(listPublications[i]);
        }
    }
}