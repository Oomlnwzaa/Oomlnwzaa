package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class TamajunActivity extends AppCompatActivity {

    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamajun);

        button = (Button) findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openOomHome();
            }
            public void openOomHome(){
                Intent intent = new Intent(TamajunActivity.this,loginActivity.class);
                startActivity(intent);
            }

        });

        button2 = (Button) findViewById(R.id.buttonLocate);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openOomHome();
            }
            public void openOomHome(){
                Intent intent = new Intent(TamajunActivity.this,MapsActivity2.class);
                startActivity(intent);
            }

        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView10);
        imageView.setImageResource(R.drawable.tamajun);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "บรรยากาศที่พัก",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView11);
        imageView2.setImageResource(R.drawable._2_tamajun);
        imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "ห้องที่พัก",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}