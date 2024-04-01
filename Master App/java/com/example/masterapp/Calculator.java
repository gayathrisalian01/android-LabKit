package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Calculator extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd,
            btnsub, btnmul, btndiv, btnClear, btnPoint, btnEqual, btnReset;
    double num1, num2;

    boolean add, sub, multiply, divide;
    EditText text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnPoint = (Button) findViewById(R.id.btndot);
        btnEqual = (Button) findViewById(R.id.btnequal);
        btnClear = (Button) findViewById(R.id.btnclear);
        btnReset = (Button) findViewById(R.id.btnclear);

        text1=(EditText)findViewById(R.id.text1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+"0");
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText(text1.getText()+".");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1==null){
                    text1.setText("");
                }
                else {
                    num1=Float.parseFloat(text1.getText()+"");
                    add=true;
                    text1.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1==null){
                    text1.setText("");
                }
                else {
                    num1=Float.parseFloat(text1.getText()+"");
                    sub=true;
                    text1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1==null){
                    text1.setText("");
                }
                else {
                    num1=Float.parseFloat(text1.getText()+"");
                    multiply=true;
                    text1.setText(null);
                }
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(text1==null){
                    text1.setText("");
                }
                else {
                    num1=Float.parseFloat(text1.getText()+"");
                    divide=true;
                    text1.setText(null);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num2 = Double.parseDouble(text1.getText() + "");
                if(add==true){
                    text1.setText(num1+num2+"");
                    add=false;
                }
                if(sub==true){
                    text1.setText(num1-num2+"");
                    sub=false;
                }
                if(multiply==true){
                    text1.setText(num1*num2+"");
                    multiply=false;
                }
                if(divide==true){
                    text1.setText(num1/num2+"");
                    divide=false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text1.setText("");
            }
        });
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back=new Intent(Calculator.this,masterApp.class);
                Toast.makeText(Calculator.this,"Back to Main Page", Toast.LENGTH_SHORT).show();
                startActivity(back);
            }
        });
    }
}