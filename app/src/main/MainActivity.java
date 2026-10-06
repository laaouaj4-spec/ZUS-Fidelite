package com.example.zusfidelity;

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

        TextView title = new TextView(this);
        title.setText("ZUS Fidelity");
        title.setTextSize(28);
        title.setTextColor(Color.BLACK);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        TextView description = new TextView(this);
        description.setText("Bienvenue dans ZUS Fidelity");
        description.setTextSize(18);
        description.setTextColor(Color.DKGRAY);
        description.setGravity(Gravity.CENTER);

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

        mainLayout.addView(title);
        mainLayout.addView(description);
        mainLayout.addView(button);

        setContentView(mainLayout);
    }
}