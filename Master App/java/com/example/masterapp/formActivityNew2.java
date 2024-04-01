package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class formActivityNew2 extends AppCompatActivity {
    private Button btn1;
    private TextView txtname, txtdetail;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_new2);
        btn1 = findViewById(R.id.button);
        txtname=findViewById(R.id.textview1);
        txtdetail=findViewById(R.id.textviewshow);
        img=findViewById(R.id.img);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String gender=intent.getStringExtra("gender");
        String hobby=intent.getStringExtra("hobby");

        txtname.setText("Hello "+name);
        txtdetail.setText(name+" is "+gender+"\n"+name+" likes "+hobby);
        img.setBackground(getResources().getDrawable(R.drawable.pic1));
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(formActivityNew2.this,formNewActivity.class);
                Toast.makeText(formActivityNew2.this,"Back to Main Page",Toast.LENGTH_SHORT).show();
                startActivity(back);
            }
        });

    }
}