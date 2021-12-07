package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class OomHouse extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oom_house);

        button = (Button) findViewById(R.id.buttonBack);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openOomHome();
            }
            public void openOomHome(){
                Intent intent = new Intent(OomHouse.this,loginActivity.class);
                startActivity(intent);
            }

        });

        ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.setImageResource(R.drawable._42515_13101710350017047503);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "บรรยากาศที่พัก",
                        Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView2 = (ImageView) findViewById(R.id.imageView5);
        imageView2.setImageResource(R.drawable.unnamed);
        imageView2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "ห้องที่พัก",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}