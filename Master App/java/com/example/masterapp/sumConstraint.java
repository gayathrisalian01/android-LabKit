package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sumConstraint extends AppCompatActivity {

    private EditText num1EditText, num2EditText;
    private TextView resultTextView;
    private Button calculateButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_constraint);

        num1EditText = findViewById(R.id.num1EditText);
        num2EditText = findViewById(R.id.num2EditText);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton = findViewById(R.id.calculateButton);
        resetButton = findViewById(R.id.resetButton);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateSum();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetValues();
            }
        });
        Button btnback=findViewById(R.id.btnback);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(sumConstraint.this, masterApp.class);
                Toast.makeText(sumConstraint.this, "Back to Main Page", Toast.LENGTH_SHORT).show();
                startActivity(back);
            }
        });
    }

    private void calculateSum() {
        String num1Str = num1EditText.getText().toString();
        String num2Str = num2EditText.getText().toString();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double sum = num1 + num2;

        resultTextView.setText(getString(R.string.result_format, sum));
        Toast.makeText(this, getString(R.string.result_toast_format, sum), Toast.LENGTH_SHORT).show();
    }

    private void resetValues() {
        num1EditText.setText("");
        num2EditText.setText("");
        resultTextView.setText("");
    }

}