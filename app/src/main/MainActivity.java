package com.example.zusfidelity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String clientId = "ZUS-FIDELITE-4587";
    private int points = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("ZUS Fidélité");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(130, 90, 180));
        title.setGravity(Gravity.CENTER);

        TextView client = new TextView(this);
        client.setText("Client : " + clientId);
        client.setTextSize(22);
        client.setGravity(Gravity.CENTER);
        client.setPadding(0, 40, 0, 20);

        TextView pointsText = new TextView(this);
        pointsText.setText("Points : " + points);
        pointsText.setTextSize(24);
        pointsText.setGravity(Gravity.CENTER);
        pointsText.setTextColor(Color.rgb(100, 70, 150));

        layout.addView(title);
        layout.addView(client);
        layout.addView(pointsText);

        setContentView(layout);
    }
}


