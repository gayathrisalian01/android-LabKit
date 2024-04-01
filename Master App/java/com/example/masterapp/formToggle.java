package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import android.widget.ToggleButton;

public class formToggle extends AppCompatActivity implements View.OnClickListener {
    private TextView textview1, textviewshow;
    private ToggleButton togglebtn;
    private EditText editviewname;
    private CheckBox chkSport, chkArt, chkSocial;
    private RadioGroup rdgrp;
    private ImageView img;
    String gender="";


    @Override
    public void onClick(View view) {
        String msg= (String) togglebtn.getText();
        if (msg.equals("Reset")) {
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
            img.setBackground(getResources().getDrawable(R.drawable.pic1));
            textviewshow.setText(name + " is " + gender + "\n" + name + " likes " + hobby);
            Toast.makeText(formToggle.this, "Display button clicked", Toast.LENGTH_SHORT).show();
        }
        else if (msg.equals("Display")) {
            Toast.makeText(getApplicationContext(), "Reset button clicked", Toast.LENGTH_SHORT).show();
            editviewname.setText("");
            chkArt.setChecked(false);
            chkSport.setChecked(false);
            chkSocial.setChecked(false);
            textview1.setVisibility(View.INVISIBLE);
            textviewshow.setText("No data found..");
            rdgrp.clearCheck();

        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_toggle);

        textview1=findViewById(R.id.textview1);
        togglebtn=findViewById(R.id.toggleButton);
        editviewname=findViewById(R.id.editviewname);
        chkSocial=findViewById(R.id.chkSocialWork);
        chkArt=findViewById(R.id.chkArt);
        chkSport=findViewById(R.id.chksport);
        textviewshow=findViewById(R.id.textviewShow);
        rdgrp=findViewById(R.id.radiogrp);
        img=findViewById(R.id.imageView);

        togglebtn.setOnClickListener(this);
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent back = new Intent(formToggle.this, masterApp.class);
               Toast.makeText(formToggle.this, "Back to Main Page", Toast.LENGTH_SHORT).show();
               startActivity(back);
           }
        });
        chkSport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(formToggle.this,"Hobby is Sports",Toast.LENGTH_SHORT).show();
            }
        });
        chkArt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(formToggle.this,"Hobby is Art",Toast.LENGTH_SHORT).show();
            }
        });
        chkSocial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(formToggle.this,"Hobby is Social Work",Toast.LENGTH_SHORT).show();
            }
        });

        rdgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rdfemale) {
                    gender = "Female";
                    Toast.makeText(formToggle.this, "Gender is Female", Toast.LENGTH_SHORT).show();
                } else if (i == R.id.rdmale) {
                    gender = "Male";
                    Toast.makeText(formToggle.this, "Gender is Male", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}