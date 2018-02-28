package com.example.trogliano.ville_futee;


import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static android.R.attr.id;
import java.net.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class VilleActivity extends FragmentActivity implements OnMapReadyCallback {

    public static final String PREFS_NAME = "VILLE_PREF";
    SharedPreferences settings;
    SharedPreferences commerces;
    Gson gson = new Gson();

    private GoogleMap mMap;
    private List<String> exempleList;

    protected void SpinnerInit() {
        //Création d'une liste d'élément à mettre dans le Spinner(pour l'exemple)

        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE); //1
        if (settings.contains("MES_VILLES")) {
            String jsonListeVille = settings.getString("MES_VILLES", null);
            Gson gson = new Gson();
            String[] mesVilles = gson.fromJson(jsonListeVille,
                    String[].class);
            exempleList = Arrays.asList(mesVilles);
            exempleList = new ArrayList<String>(exempleList);
        }
        if(exempleList == null || exempleList.isEmpty()){
            exempleList = new ArrayList<String>();
            exempleList.add("Marseille");
            exempleList.add("Montpellier");
            exempleList.add("Paris");
            exempleList.add("Ajouter ville");
        }
    }

        protected void SpinnerCreator(){

            final Spinner spinner;
            spinner = (Spinner) findViewById(R.id.spinner);

            final ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                exempleList
        );
               /* On definit une présentation du spinner quand il est déroulé         (android.R.layout.simple_spinner_dropdown_item) */
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Enfin on passe l'adapter au Spinner et c'est tout
        spinner.setAdapter(adapter);

            spinner.setSelection(getIndexVille());

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

                if (exempleList.size() - 1 == position) {
                    LinearLayout ll1 = (LinearLayout) findViewById(R.id.linearLayout1);
                    ll1.setVisibility(View.INVISIBLE);
                    LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout);
                    ll.setVisibility(View.INVISIBLE);
                    LinearLayout hl = (LinearLayout) findViewById(R.id.hiddenlayout);
                    hl.setVisibility(View.VISIBLE);
                    ajoutVille(adapter);
                    //Toast.makeText(getBaseContext(), "Ajout d'une ville", Toast.LENGTH_LONG).show();
                } else {

                    LatLng coordVille = getLocationFromAddress(getBaseContext(),exempleList.get(position));
                    mapChangeVille(coordVille,exempleList.get(position));
                    saveIndexVille(position);
                    //Toast.makeText(getBaseContext(), "Map of " +(CharSequence) exempleList.get(position), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
    }

    public void saveIndexVille(int index){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        settings.edit().putInt("MON_CHOIX", index).apply();
    }

    public int getIndexVille(){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        return settings.getInt("MON_CHOIX", 0);
    }

    public void ajoutVille(final ArrayAdapter adapter){
        final EditText nomVille = (EditText) findViewById(R.id.nomVille);
        final Button buttonBack = (Button) findViewById(R.id.buttonHidden);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                int size=exempleList.size();
                int i=0;
                for(i=0; i<size-1; i++) {
                    int compare = ((String) exempleList.get(i)).compareTo(nomVille.getText().toString());
                    if (compare > 0) {
                        break;
                    }
                }
                exempleList.add(i, nomVille.getText().toString());

                //Gestion du layout
                InputMethodManager mgr = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                mgr.hideSoftInputFromWindow(nomVille.getWindowToken(), 0);
                LinearLayout hl =(LinearLayout) findViewById(R.id.hiddenlayout);
                LinearLayout ll1 =(LinearLayout) findViewById(R.id.linearLayout1);
                LinearLayout ll =(LinearLayout) findViewById(R.id.linearLayout);
                hl.setVisibility(View.INVISIBLE);
                saveVille();
                adapter.notifyDataSetChanged();
                ll.setVisibility(View.VISIBLE);
                ll1.setVisibility(View.VISIBLE);

            }
        });
    }

    public void saveVille(){
        settings = getBaseContext().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        String jsonListeVille = gson.toJson(exempleList);
        settings.edit().putString("MES_VILLES", jsonListeVille).apply();
    }

    public LatLng getLocationFromAddress(Context context, String strAddress) {

        Geocoder coder = new Geocoder(context);
        List<Address> address;
        LatLng p1 = null;

        try {
            // May throw an IOException
            address = coder.getFromLocationName(strAddress, 5);
            if (address == null) {
                return null;
            }
            Address location = address.get(0);
            location.getLatitude();
            location.getLongitude();

            p1 = new LatLng(location.getLatitude(), location.getLongitude() );

        } catch (IOException ex) {

            ex.printStackTrace();
        }

        return p1;
    }

    protected boolean isRouteDisplayed(){
        return false;
    }

    protected void VilleLayout() {
        LinearLayout hl =(LinearLayout) findViewById(R.id.hiddenlayout);
        hl.setVisibility(View.INVISIBLE);
        SpinnerInit();
        SpinnerCreator();

        final EditText mdp = (EditText) findViewById(R.id.editText);

        final ImageButton buttonBack = (ImageButton) findViewById(R.id.back_button);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                finish();
            }
        });

        final Button buttonPrefMap = (Button) findViewById(R.id.buttonPrefMap);
        buttonPrefMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent act_buttonPrefMap = new Intent(VilleActivity.this, FavouritesActivity.class);
                startActivity(act_buttonPrefMap);

            }
        });

        final Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LatLng coordVille = getLocationFromAddress(getBaseContext(),mdp.getText().toString());
                mapChangeVille(coordVille,mdp.getText().toString());
            }
        });

    }

    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney, Australia, and move the camera.
        LatLng ville = new LatLng(43.3, 5.4);
        CameraPosition cameraPosition = new CameraPosition.Builder().target(ville).zoom(12.0f).build();
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
        mMap.moveCamera(cameraUpdate);
        mMap.addMarker(new MarkerOptions().position(ville).title("Start Marker"));
        setCommerceOnMap(retrieveCommerceName(),retrieveCommerceAdresse());

    }

    public void mapChangeVille(LatLng ville, String nomVille) {

        CameraPosition cameraPosition = new CameraPosition.Builder().target(ville).zoom(12.0f).build();
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition);
        mMap.moveCamera(cameraUpdate);
        mMap.addMarker(new MarkerOptions().position(ville).title("Marker in "+nomVille));

    }

    public void setCommerceOnMap(List<String> name, List<String> adresse){
    //il faudrait une fonction équivalente avec un radius et l'appeler sur mapChange Ville pour être mieux

        for(int i=0; i<adresse.size(); i++) {
            LatLng commerce = getLocationFromAddress(getBaseContext() ,adresse.get(i));
            mMap.addMarker(new MarkerOptions().position(commerce).title(name.get(i)).icon(BitmapDescriptorFactory
                    .defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
        }
    }

    public List<String> retrieveCommerceAdresse(){
        //récupérer les adresses des commerces

        List Adresse = new ArrayList();
        Adresse.add("Rue de la cavalerie Montpellier");
        Adresse.add("Rue de la République Montpellier");
        return Adresse;
    }

    public List<String> retrieveCommerceName(){
        //récupérer les noms des commerces
        //commerces = getBaseContext().getSharedPreferences("commerce_prefs", MODE_PRIVATE);
        List name = new ArrayList();
        name.add("Titi");
        name.add("Grominet");
        return name;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ville);
        VilleLayout();
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        //String testResult;
       /* int responseCode;
        double[] doubles= new double[0];
        responseCode =  test.getLatLongByURLv2("mumbai");
        Toast.makeText(getBaseContext(), "code"+responseCode, Toast.LENGTH_LONG).show();*/

    }
}

