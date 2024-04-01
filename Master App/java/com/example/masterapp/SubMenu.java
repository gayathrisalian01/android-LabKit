package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SubMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.submenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.search_item) {
            Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
            return true;
        } else if (itemId == R.id.upload_item) {
            Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();
            return true;
        } else if (itemId == R.id.copy) {
            Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();
            return true;
        } else if (itemId == R.id.copy1) {
            Toast.makeText(getApplicationContext(),"Item 4 Selected",Toast.LENGTH_LONG).show();
            return true;
        } else if (itemId == R.id.copy2) {
            Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();
            return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }
}