package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class LifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("Lifecycle Phases", "onCreate is launched");
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(LifeCycle.this, masterApp.class);
                Toast.makeText(LifeCycle.this, "Back to Main Page", Toast.LENGTH_SHORT).show();
                startActivity(back);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle Phases", "onStart is launched");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle Phases", "onResume is launched");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle Phases", "onPause is launched");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle Phases", "onStop is launched");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle Phases", "onRestart is launched");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle Phases", "onDestroy is launched");
    }

}