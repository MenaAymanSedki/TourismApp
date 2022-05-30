package com.menadev.tourismapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.menadev.tourismapp.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setTheme(MainActivity.themesList[MainActivity.themeIndex])
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        Color.BLACK
        binding.aboutText.text ="Developed By:menadev if you want to provide feedback,I will love to hear that "


    }
}