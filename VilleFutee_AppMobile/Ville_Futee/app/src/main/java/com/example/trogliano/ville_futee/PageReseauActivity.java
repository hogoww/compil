package com.example.trogliano.ville_futee;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class PageReseauActivity extends AppCompatActivity{

    SharedPreferences sharedPreferences1;
    SharedPreferences sharedPreferences2;
    private static final String PREFS = "reseaux_prefs";
    private static final String PREFS_RES = "PREFS_RES";
    private static final String LOGIN = "login_prefs";
    private static final String PREFS_NAME = "PREFS_NAME";

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_reseau);

        sharedPreferences1 = getBaseContext().getSharedPreferences(PREFS, MODE_PRIVATE);
        sharedPreferences2 = getBaseContext().getSharedPreferences(LOGIN, MODE_PRIVATE);

        String name = sharedPreferences1.getString(PREFS_RES, null);
        String util = sharedPreferences1.getString(PREFS_NAME, null);

        TextView tv = (TextView) findViewById(R.id.reseau_name);
        tv.setText(name);

        //Les structures de données qui vont contenir les infos du serveur
        String desc = new String();
        // Liste de listes à deux éléments : Publieur, Contenu
        ArrayList<ArrayList<String>> publications = new ArrayList<ArrayList<String>>();
        ArrayList<String> membres = new ArrayList<String>();

        //Requête au serveur pour avoir la description du réseau, les publications et la liste des membres.

        desc = "Ceci est la description de "+ name + ", elle peut être longue, elle peut être courte, mais attention plus " +
                "elle est longue et plus elle est difficile à lire car il faut scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll,scroll" +
                ",scroll,scroll,scroll,scroll...";

        TextView description = (TextView) findViewById(R.id.description_reseau);
        description.setText(desc);

        LinearLayout lastpubList = (LinearLayout) findViewById(R.id.public_list);
        lastpubList.removeAllViewsInLayout();

        //********************(SIMULATION D'UNE RECEPTION)**************************//
        //Pour chaque publication :
        final ArrayList<String> auteur = new ArrayList<String>();
        final ArrayList<String> contenu = new ArrayList<String>();

        for(int i=0 ; i < 11 ; i ++){
            auteur.add(i,"Auteur "+i);
            contenu.add(i,"Ceci est un contenu incroyable, nous pouvons lire autant d'informations que lors d'un discours de Macron, n'est-ce pas incroyable? Si si, je sais que vous" +
                    " trouvez ça incroyable ;)");
        }
        //************************************************************************//

        //Les différents éléments servants à la fabrication de chaque publication
        LinearLayout[] listPublications = new LinearLayout[contenu.size()];
        TextView[] listAuteur = new TextView[contenu.size()];
        TextView[] listContenu = new TextView[contenu.size()];

        //La variable param servant à paramétrer les checkboxs
        final LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams. MATCH_PARENT , LinearLayout.LayoutParams. WRAP_CONTENT );

        //Variable servant à convertir les pixels en DP
        final float scale = this.getResources().getDisplayMetrics().density;

        //Boucle de construction
        for(int i=0; i < contenu.size() ; i++){

            //Le layout contenant les champs de texte
            listPublications[i] = new LinearLayout(this);
            listAuteur[i] = new TextView(this);
            listContenu[i] = new TextView(this);
            listPublications[i].setOrientation(LinearLayout.VERTICAL);
            listPublications[i].setMinimumHeight((int) (50 * scale + 0.5f));
            if(i%2==0)
                listPublications[i].setBackgroundColor(0xFFD6D6D6);
            listPublications[i].setPadding(0,(int) (10 * scale + 0.5f),0,(int) (10 * scale + 0.5f));

            //Les différents champs de textes
            listAuteur[i].setText(auteur.get(i) +" :");
            listAuteur[i].setTextSize(16);
            listAuteur[i].setTextColor(0xFF000000);
            listContenu[i].setText(contenu.get(i));
            listContenu[i].setTextSize(14);
            listContenu[i].setTextColor(0xFF111111);

            //Ajout des éléments
            listPublications[i].addView(listAuteur[i],params);
            listPublications[i].addView(listContenu[i],params);
            lastpubList.addView(listPublications[i]);
        }
    }
}
