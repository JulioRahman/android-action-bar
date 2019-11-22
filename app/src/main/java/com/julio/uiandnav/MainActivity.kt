package com.julio.uiandnav

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Title"
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setIcon(R.drawable.ic_menu) // untuk menampilkan ikon, atau
        actionBar?.setLogo(R.drawable.ic_launcher_foreground) // untuk menampilkan gambar
        actionBar?.setDisplayUseLogoEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
}