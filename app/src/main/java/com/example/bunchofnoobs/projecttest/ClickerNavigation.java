package com.example.bunchofnoobs.projecttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClickerNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker_navigation);
        Button b1 =(Button)findViewById(R.id.btnLevel1);
        Button b2 =(Button)findViewById(R.id.btnLevel2);
        Button b3 =(Button)findViewById(R.id.btnLevel3);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(ClickerNavigation.this,ClickerLevel1.class);
                startActivity(myintent2);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(ClickerNavigation.this,ClickerLevel2.class);
                startActivity(myintent2);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(ClickerNavigation.this,ClickerLevel3.class);
                startActivity(myintent2);

            }
        });



    }
}
