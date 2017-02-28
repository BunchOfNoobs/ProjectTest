package com.example.bunchofnoobs.projecttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GamesNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_navigation);

        Button b1 =(Button)findViewById(R.id.btnClickNav);
        Button b2 =(Button)findViewById(R.id.btnNumberNav);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(GamesNavigation.this,ClickerNavigation.class);
                startActivity(myintent2);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(GamesNavigation.this,NumberGame.class);
                startActivity(myintent2);

            }
        });

    }
}
