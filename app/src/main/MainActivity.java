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

        // الصفحة الرئيسية
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setGravity(Gravity.CENTER);
        mainLayout.setPadding(40, 40, 40, 40);
        mainLayout.setBackgroundColor(Color.WHITE);

        // عنوان التطبيق
        TextView title = new TextView(this);
        title.setText("ZUS Fidélité");
        title.setTextSize(30);
        title.setTextColor(Color.BLACK);
        title.setTypeface(null, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);

        // وصف
        TextView description = new TextView(this);
        description.setText(
                "Bienvenue dans votre carte de fidélité numérique\n\n" +
                "Scannez votre QR Code ou utilisez NFC."
        );
        description.setTextSize(18);
        description.setText