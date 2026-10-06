package com.example.zusfidelity;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Création du layout principal
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setGravity(Gravity.CENTER);
        mainLayout.setPadding(40, 40, 40, 40);
        mainLayout.setBackgroundColor(Color.WHITE);

        // Titre
        TextView title = new TextView(this);
        title.setText("ZUS Fidelity");
        title.setTextSize(30);
        title.setTextColor(Color.BLACK);
        title.setGravity(Gravity.CENTER);
        title.setPadding(0, 0, 0, 30);

        // Description
        TextView description = new TextView(this);
        description.setText("Bienvenue dans l'application ZUS Fidelity");
        description.setTextSize(18);
        description.setTextColor(Color.DKGRAY);
        description.setGravity(Gravity.CENTER);
        description.setPadding(0, 0, 0, 40);

        // Bouton
        Button button = new Button(this);
        button.setText("Commencer");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Bienvenue dans ZUS Fidelity",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        // Ajouter les éléments au layout
        mainLayout.addView(title);
        mainLayout.addView(description);
        mainLayout.addView(button);

        // Afficher le layout
        set