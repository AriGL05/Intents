package com.example.animplements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView countdownText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button imp = findViewById(R.id.implicitos);
        Button exp = findViewById(R.id.explicitos);
        countdownText = findViewById(R.id.countdown_text);

        startCountdown();
        imp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntImp = new Intent(MainActivity.this, IntentsImplicitos.class);
                startActivity(IntImp);
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntExp = new Intent(MainActivity.this, IntentsExplicitos.class);
                startActivity(IntExp);
            }
        });
    }
    private void startCountdown() {
        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {

                int seconds = (int) (millisUntilFinished / 1000);
                countdownText.setText(String.valueOf(seconds));
            }

            public void onFinish() {
                countdownText.setVisibility(View.GONE);
            }
        }.start();
    }
}