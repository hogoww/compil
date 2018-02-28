package com.example.trogliano.ville_futee;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.ImageButton;


public class AlerteActivity extends AppCompatActivity {


    protected void AlerteInteraction() {

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
        setContentView(R.layout.activity_alerte);
        AlerteInteraction();
    }
}