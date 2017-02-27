package com.example.bunchofnoobs.projecttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 =(Button)findViewById(R.id.btnLevel1);
        Button b2 =(Button)findViewById(R.id.btnLevel2);
        Button b3 =(Button)findViewById(R.id.btnLevel3);

        b1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainActivity.this,Level1.class);
                startActivity(myintent2);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainActivity.this,Level2.class);
                startActivity(myintent2);

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent myintent2 = new Intent(MainActivity.this,Level3.class);
                startActivity(myintent2);

            }
        });



    }
}
