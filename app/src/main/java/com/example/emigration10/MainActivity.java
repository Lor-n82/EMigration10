package com.example.emigration10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View easySplashScreenView = new EasySplashScreen(MainActivity.this)
                .withFullScreen()
                .withTargetActivity(Usuario.class)
                .withSplashTimeOut(4000)
                .withBackgroundResource(android.R.color.holo_red_light)
                .withHeaderText("")
                .withFooterText("Copyright 2019")
                .withBeforeLogoText("")
                .withLogo(R.drawable.entelgy)
                .withAfterLogoText("Accelerating the change. Fast")
                .create();

        setContentView(easySplashScreenView);
    }
}
