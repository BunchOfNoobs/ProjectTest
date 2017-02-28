package com.example.bunchofnoobs.projecttest;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ClickerLevel1 extends AppCompatActivity {

    TextView tvTime, tvClicks;
    Button btnClick,btnStart;

    CountDownTimer timer;
    int time = 15;

    int clicks = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicker_level1);

        tvTime = (TextView) findViewById(R.id.tvTime);
        tvClicks = (TextView) findViewById(R.id.tvClicks);
        btnClick = (Button) findViewById(R.id.btnClick);
        btnStart = (Button) findViewById(R.id.btnStart);

        btnStart.setEnabled(true);
        btnClick.setEnabled(false);

        timer = new CountDownTimer(15000, 1000) {
            @Override
            public void onTick(long millisUntilFinished){

                time --;
                tvTime.setText("Time " + time );

            }

            @Override
            public void onFinish() {

                btnStart.setEnabled(true);
                btnClick.setEnabled(false);

                if (clicks >= 100)
                tvTime.setText("Well done");
                else
                tvTime.setText("You Suck");

            }
        };

        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                clicks++;
                tvClicks.setText("Clicks " + clicks );
            }

        });

        btnStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                timer.start();
                btnStart.setEnabled(false);
                btnClick.setEnabled(true);
                clicks =0;
                time = 15;
                tvTime.setText("Time " + time);
                tvClicks.setText("Clicks " + clicks );

            }

        });
    }
}
