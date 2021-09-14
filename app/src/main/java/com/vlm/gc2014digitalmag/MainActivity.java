package com.vlm.gc2014digitalmag;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void polyPage(View view) {
        Intent polyIntent = new Intent(MainActivity.this,polyActivity.class);
        startActivity(polyIntent);
    }

    public void selamPage(View view) {
        Intent selamIntent = new Intent(MainActivity.this,selamActivity.class);
        startActivity(selamIntent);
    }

    public void zenzelimaPage(View view) {
        Intent zIntent = new Intent(MainActivity.this,zenzelimaActivity.class);
        startActivity(zIntent);
    }

    public void pedaPage(View view) {
        Intent pedaIntent = new Intent(MainActivity.this,pedaActivity.class);
        startActivity(pedaIntent);
    }

    public void yibabPage(View view) {
        Intent yibabIntent = new Intent(MainActivity.this,yibabActivity.class);
        startActivity(yibabIntent);
    }
}