package com.example.formapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textview1,textviewshow;
    private Button buttonn;
    private EditText editviewname;
    private CheckBox chkSport, chkArt, chkSocial;
    private RadioGroup rdgrp;
    private ImageView img;
    String gender="";


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            String hobby = "";
            Editable name = editviewname.getText();
            if (chkSport.isChecked())
                hobby = "Sports";
            if (chkArt.isChecked())
                hobby = hobby + ", Art";
            if (chkSocial.isChecked())
                hobby = hobby + ", Social work";
            textview1.setText("Hello " + name);
            textview1.setTextColor(getResources().getColor(R.color.black));
            textviewshow.setText(name + " is " + gender + "\n" + name + " likes " + hobby);
            img.setBackground(getResources().getDrawable(R.drawable.pic1));
            Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview1=findViewById(R.id.textview1);
        buttonn=findViewById(R.id.button1);
        editviewname=findViewById(R.id.editviewname);
        chkSocial=findViewById(R.id.chkSocialWork);
        chkArt=findViewById(R.id.chkArt);
        chkSport=findViewById(R.id.chksport);
        textviewshow=findViewById(R.id.textviewShow);
        rdgrp=findViewById(R.id.radiogrp);
        img=findViewById(R.id.imageView);

        buttonn.setOnClickListener(this);

        chkSport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this,"Hobby is Sports",Toast.LENGTH_SHORT).show();
            }
        });
        chkArt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this,"Hobby is Art",Toast.LENGTH_SHORT).show();
            }
        });
        chkSocial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this,"Hobby is Social Work",Toast.LENGTH_SHORT).show();
            }
        });

                    rdgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int i) {
                    if (i == R.id.rdfemale) {
                        gender = "Female";
                        Toast.makeText(MainActivity.this,"Gender is Female",Toast.LENGTH_SHORT).show();
                    } else if (i == R.id.rdmale) {
                        gender = "Male";
                        Toast.makeText(MainActivity.this,"Gender is Male",Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
}