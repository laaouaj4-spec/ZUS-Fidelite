package com.example.zusfidelite;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
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

        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setGravity(Gravity.CENTER);
        mainLayout.setPadding(40, 40, 40, 40);
        mainLayout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("ZUS Fidélité");
        title.setTextSize(30);
        title.setTextColor(Color.BLACK);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView description = new TextView(this);
        description.setText(
                "Bienvenue dans votre carte de fidélité numérique\n\n"
                + "Scannez votre QR Code ou utilisez NFC."
        );
        description.setTextSize(18);
        description.setTextColor(Color.DKGRAY);
        description.setGravity(Gravity.CENTER);
        description.setPadding(0, 30, 0, 40);

        Button qrButton = new Button(this);
        qrButton.setText("Scanner QR Code");
        qrButton.setTextSize(18);

        qrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Scanner QR Code",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        Button nfcButton = new Button(this);
        nfcButton.setText("Utiliser NFC");
        nfcButton.setTextSize(18);

        nfcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        MainActivity.this,
                        "Fonction NFC",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        Button cardButton = new Button(this);
        cardButton.setText("Ma