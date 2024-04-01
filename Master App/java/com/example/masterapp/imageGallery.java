package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.AdapterView;
import android.view.View;

public class imageGallery extends AppCompatActivity {

    private int[] pImages = {R.drawable.apj, R.drawable.droupadi, R.drawable.prathiba,
            R.drawable.pranab, R.drawable.ramnath};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_gallery);

        GridView gridView = findViewById(R.id.gridView);
        imageAdapter adapter = new imageAdapter(this, pImages);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nxtPage = new Intent(imageGallery.this, FullScreenActivity.class);
                nxtPage.putExtra("imgR", pImages[position]);
                startActivity(nxtPage);
            }
        });
    }
}
