package com.example.masterapp;

import android.os.Bundle;
import android.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class pranab extends Fragment {

    View view;
    TextView textView,textView2;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pranab, container, false);
        textView = view.findViewById(R.id.textView);
        textView2 = view.findViewById(R.id.textView2);
        textView.setText("Pranab Mukherjee \n 25 July 2012 – 25 July 2017");
        textView2.setText( "chairman and president of the Rabindra Bharati University\n"+
                " trustee of the Bangiya Sahitya Parishad and the Bidhan Memorial Trust.");
        return view;
    }
}