package com.example.myapplication;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class loginActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Button button;
    private Button button2;
    private Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openOomHome();
            }
            public void openOomHome(){
                Intent intent = new Intent(loginActivity.this,OomHouse.class);
                startActivity(intent);
            }

        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v ){ openTamajun();}
            public void openTamajun(){
                Intent intent = new Intent(loginActivity.this,TamajunActivity.class);
                startActivity(intent);
            }

        });
        button2 = (Button) findViewById(R.id.button12);
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openOomHome2();
            }
            public void openOomHome2(){
                Intent intent = new Intent(loginActivity.this,ProfileActivity.class);
                startActivity(intent);
            }

        });


        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setItemIconTintList(null);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_sale, R.id.navigation_like, R.id.navigation_setting)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
    }

}
