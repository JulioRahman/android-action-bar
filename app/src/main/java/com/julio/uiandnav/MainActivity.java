package com.julio.uiandnav;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar(); // atau getActionBar();
        actionBar.setTitle("Title");

        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.ic_menu); // untuk menampilkan ikon, atau
        actionBar.setLogo(R.mipmap.ic_launcher); // untuk menampilkan gambar
        actionBar.setDisplayUseLogoEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
