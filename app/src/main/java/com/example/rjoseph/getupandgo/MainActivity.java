package com.example.rjoseph.getupandgo;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.appcompat.*;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

public class MainActivity extends Activity{

    ImageButton _analyzeSurroundingsBtn;
    ImageButton _findHikingTrailBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _analyzeSurroundingsBtn = (ImageButton) findViewById(R.id.analyzeSurroundingsBtn);
        _findHikingTrailBtn = (ImageButton) findViewById(R.id.findHikingTrailBtn);

        _analyzeSurroundingsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intentAnalyzeSurroundings = new Intent(MainActivity.this,AnalyzeSurrounding.class);
               startActivity(intentAnalyzeSurroundings);
            }
        });

        _findHikingTrailBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentFindHikingTrail = new Intent(MainActivity.this, FindHikingTrail.class);
                startActivity(intentFindHikingTrail);
            }
        });

    }
}
