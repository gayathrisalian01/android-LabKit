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

public class formNewActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textview1,textviewshow;
    private Button buttonn;
    private EditText editviewname;
    private CheckBox chkSport, chkArt, chkSocial;
    private RadioGroup rdgrp;
    private ImageView img;
    String gender="";
    Boolean art,sp,social;

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
            sp=chkSport.isChecked();
            art=chkSport.isChecked();
            social=chkSport.isChecked();
            Intent intent=new Intent(formNewActivity.this,formActivityNew2

                    .class);
            intent.putExtra("name",name.toString());
            intent.putExtra("gender",gender);
            intent.putExtra("hobby",hobby);

            startActivity(intent);
            Toast.makeText(formNewActivity.this, "Submit Button Clicked", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_new);
        rdgrp = findViewById(R.id.radiogrp);
        textview1=findViewById(R.id.textview1);
        buttonn=findViewById(R.id.button1);
        editviewname=findViewById(R.id.editviewname);
        chkSocial=findViewById(R.id.chkSocialWork);
        chkArt=findViewById(R.id.chkArt);
        chkSport=findViewById(R.id.chksport);

        buttonn.setOnClickListener(this);
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent back = new Intent(formNewActivity.this, masterApp.class);
               Toast.makeText(formNewActivity.this, "Back to Main Page", Toast.LENGTH_SHORT).show();
               startActivity(back);
           }
       });

        chkSport.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(formNewActivity.this,"Hobby is Sports",Toast.LENGTH_SHORT).show();
            }
        });
        chkArt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(formNewActivity.this,"Hobby is Art",Toast.LENGTH_SHORT).show();
            }
        });
        chkSocial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(formNewActivity.this,"Hobby is Social Work",Toast.LENGTH_SHORT).show();
            }
        });

        rdgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rdfemale) {
                    gender = "Female";
                    Toast.makeText(formNewActivity.this,"Gender is Female",Toast.LENGTH_SHORT).show();
                } else if (i == R.id.rdmale) {
                    gender = "Male";
                    Toast.makeText(formNewActivity.this,"Gender is Male",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}