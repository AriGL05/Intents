package com.example.animplements;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView countdownText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countdownText = findViewById(R.id.countdown_text);

        startCountdown();
    }
    private void startCountdown() {
        new CountDownTimer(5000, 1000) { // Countdown for 5 seconds, with updates every 1 second
            public void onTick(long millisUntilFinished) {
                // Update the TextView with the remaining seconds
                int seconds = (int) (millisUntilFinished / 1000);
                countdownText.setText(String.valueOf(seconds));
            }

            public void onFinish() {
                countdownText.setVisibility(View.GONE);
            }
        }.start();
    }
}