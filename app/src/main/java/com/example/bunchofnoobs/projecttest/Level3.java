package com.example.bunchofnoobs.projecttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Level3 extends AppCompatActivity {

    int minteger = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
    }

    public void NumberOfClicksLeft(View view) {

        minteger = minteger - 1;
        display(minteger);

        if (minteger <= 0) {
            displayMessage("You have won");
        }

    }

    private void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.integer_number);
        displayInteger.setText("" + number);
    }

    private void displayMessage(String word) {
        TextView displayInteger = (TextView) findViewById(R.id.integer_number);
        displayInteger.setText("" + word);
    }
}
