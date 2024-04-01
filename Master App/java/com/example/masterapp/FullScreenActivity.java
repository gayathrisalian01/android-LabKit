package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;


public class FullScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullsrcn);

        ImageView fullScreenImgView = findViewById(R.id.fullScreenImageView);

        Intent intent = getIntent();
        int imgR = intent.getIntExtra("imgR", 0);
        fullScreenImgView.setImageResource(imgR);
    }
}
