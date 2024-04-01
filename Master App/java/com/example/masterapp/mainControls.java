package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mainControls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.controlslayout);
    }
    public void redirectDatePicker(View v){
        Intent intentRedirect = new Intent(getApplicationContext(), Datepick.class);
        startActivity(intentRedirect);
    }
    public void redirectTimePicker(View v){
        Intent intentRedirect = new Intent(getApplicationContext(), Timepick.class);
        startActivity(intentRedirect);
    }
    public void redirectFloatingActionBtn(View v){
        Intent intentRedirect = new Intent(getApplicationContext(), FloatingActionBtn.class);
        startActivity(intentRedirect);
    }
    public void redirectProgressBar(View v){
        Intent intentRedirect = new Intent(getApplicationContext(), ProgressBar.class);
        startActivity(intentRedirect);
    }
    public void redirectSubMenu(View v){
        Intent intentRedirect = new Intent(getApplicationContext(), SubMenu.class);
        startActivity(intentRedirect);
    }
}