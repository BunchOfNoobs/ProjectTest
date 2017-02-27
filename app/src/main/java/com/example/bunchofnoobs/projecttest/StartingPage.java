package com.example.bunchofnoobs.projecttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StartingPage extends AppCompatActivity {

    public Button startpage_next;

    public void init() {
        startpage_next = (Button) findViewById(R.id.startpage_next);
        startpage_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(StartingPage.this, MainActivity.class);

                startActivity(toy);

            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_page);
        init();

    }

}
