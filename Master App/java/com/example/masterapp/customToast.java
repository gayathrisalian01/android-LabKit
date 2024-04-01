package com.example.masterapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class customToast extends AppCompatActivity {

    private Spinner bankSpinner;

    private String[] bankNames = {"State Bank of India", "ICICI Bank", "HDFC Bank", "Axis Bank", "Kotak Mahindra Bank"};
    private int[] bankLogos = {R.drawable.sbi, R.drawable.icici, R.drawable.hdfc, R.drawable.axis, R.drawable.kotak};
    private String[] bankIFSCCodes = {"SBIN0000001", "ICIC0000002", "HDFC0000003", "AXSB0000004", "KOTAK0000005"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customtoast);

        bankSpinner = findViewById(R.id.bankSpinner);
        ArrayAdapter<String> bankAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, bankNames);
        bankAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bankSpinner.setAdapter(bankAdapter);

        bankSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedBankName = bankNames[position];
                int selectedBankLogo = bankLogos[position];
                String selectedBankIFSCCode = bankIFSCCodes[position];

                // Show custom toast with the IFSC code of the selected bank
                LayoutInflater inflater = getLayoutInflater();
                View toastLayout = inflater.inflate(R.layout.activity_custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
                ImageView toastImageView = toastLayout.findViewById(R.id.custom_toast_image);
                toastImageView.setImageResource(selectedBankLogo);
                TextView toastTextView = toastLayout.findViewById(R.id.custom_toast_message);
                toastTextView.setText(selectedBankIFSCCode);

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(toastLayout);
                toast.show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle nothing selected if needed
            }
        });
    }
}
