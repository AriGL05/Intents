package com.example.animplements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentsExplicitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_explicitos);

        Button anim = findViewById(R.id.animation);
        Button about = findViewById(R.id.about);

        anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent anIntent = new Intent(IntentsExplicitos.this, Animation.class);
                startActivity(anIntent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abIntent = new Intent(IntentsExplicitos.this, Aboutus.class);
                startActivity(abIntent);
            }
        });
    }
}