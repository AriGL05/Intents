package com.example.animplements;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IntentsImplicitos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents_implicitos);
        Button epic = findViewById(R.id.epic);
        Button hamilton = findViewById(R.id.hamilton);
        Button heathers = findViewById(R.id.heathers);
        Button cyclone = findViewById(R.id.cyclone);


        epic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=mhPbrvRMj1o"));
                startActivity(intent);
            }
        });
        hamilton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=aPSWZUExZ8M&t=5645s&pp=ygUIaGFtaWx0b24%3D"));
                startActivity(intent);
            }
        });
        heathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=cikbgjAJPBU&pp=ygUIaGVhdGhlcnM%3D"));
                startActivity(intent);
            }
        });
        cyclone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Jf0xVYkyCT8&list=PLifAvT3M8XMqswlRaMLkvDyzjGd73kh3_"));
                startActivity(intent);
            }
        });
    }
}