package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Intent;

public class menup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.action_toast) {
            android.widget.Toast.makeText(this, "  Welcome!! ", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.action_exit) {
            finish();
            return true;
        } else if(itemId==R.id.action_president){
                Intent first=new Intent(menup.this,MainActivityPresident.class);
                startActivity(first);
                return true;
        }
        else {
            return super.onOptionsItemSelected(item);
        }
    }

}
