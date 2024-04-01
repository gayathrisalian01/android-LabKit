package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class masterApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1=(Button)findViewById(R.id.btn1);
        Button btn2=(Button)findViewById(R.id.btn2);
        Button btn3=(Button)findViewById(R.id.btn3);
        Button btn4=(Button)findViewById(R.id.btn4);
        Button btn5=(Button)findViewById(R.id.btn5);
        Button btn6=(Button)findViewById(R.id.btn6);
        Button btn7=(Button)findViewById(R.id.btn7);
        Button btn8=(Button)findViewById(R.id.btn8);
        Button btn9=(Button)findViewById(R.id.btn9);
        Button btn10=(Button)findViewById(R.id.btn10);
        Button btn11=(Button)findViewById(R.id.btn11);
        Button btn12=(Button)findViewById(R.id.btn12);
        Button btn13=(Button)findViewById(R.id.btn13);
        Button btn14=(Button)findViewById(R.id.btn14);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one=new Intent(masterApp.this,Helloworld.class);
                startActivity(one);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent two=new Intent(masterApp.this,Toast.class);
                startActivity(two);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent three=new Intent(masterApp.this,LifeCycle.class);
                startActivity(three);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent four=new Intent(masterApp.this,sumLinear.class);
                startActivity(four);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent five=new Intent(masterApp.this,sumConstraint.class);
                startActivity(five);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent six=new Intent(masterApp.this,sumRelative.class);
                startActivity(six);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seven=new Intent(masterApp.this,Form.class);
                startActivity(seven);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eight=new Intent(masterApp.this,Calculator.class);
                startActivity(eight);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nine=new Intent(masterApp.this,formToggle.class);
                startActivity(nine);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ten=new Intent(masterApp.this,formNewActivity.class);
                startActivity(ten);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ele=new Intent(masterApp.this,customToast.class);
                startActivity(ele);
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent twe=new Intent(masterApp.this,menup.class);
                startActivity(twe);
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirt=new Intent(masterApp.this,mainControls.class);
                startActivity(thirt);
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourt=new Intent(masterApp.this,imageGallery.class);
                startActivity(fourt);
            }
        });


    }
}