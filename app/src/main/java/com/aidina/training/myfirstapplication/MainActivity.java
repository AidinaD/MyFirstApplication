package com.aidina.training.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private long delay = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer = new Timer();
        timer.schedule(task, delay);
    }

    private TimerTask task = new TimerTask() {
        @Override
        public void run() {
            startActivity(new Intent(MainActivity.this, CalculatorActivity.class));
            finish();
        }
    };

}





