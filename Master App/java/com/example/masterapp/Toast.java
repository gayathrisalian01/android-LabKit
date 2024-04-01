package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Toast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        android.widget.Toast.makeText(getApplicationContext(),"App open",
        android.widget.Toast.LENGTH_SHORT).show();
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(Toast.this,masterApp.class);
                android.widget.Toast.makeText(Toast.this,"Back to Main Page", android.widget.Toast.LENGTH_SHORT).show();
                startActivity(back);
            }
        });
    }
    public void toast(View view)
    {
        android.widget.Toast.makeText(Toast.this, "you clicked the button", android.widget.Toast.LENGTH_SHORT).show();
    }
}