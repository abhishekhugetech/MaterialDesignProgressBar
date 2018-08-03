package com.epiclancers.app.materialdesignprogressbar;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    CountDownTimer countDownTimer;
    ProgressBar progressBar;
    ProgressBar horizontalprogressBar;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar1);
        horizontalprogressBar = findViewById(R.id.horizontalProgressBar);
        horizontalprogressBar.setMax(100);
        horizontalprogressBar.setProgress(0);



        countDownTimer = new CountDownTimer(10000,100) {
            @Override
            public void onTick(long millisUntilFinished) {
                int progressOf = (10000 - Integer.parseInt(millisUntilFinished+""))/100;
                System.out.println(progressOf);
                horizontalprogressBar.setProgress(progressOf);
            }

            @Override
            public void onFinish() {
                horizontalprogressBar.setProgress(100);
            }
        }.start();
    }
}
