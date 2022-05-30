@file:Suppress("ImplicitThis")

package com.menadev.tourismapp

import android.annotation.SuppressLint
import android.content.Intent
import android.content.Intent.*
import android.graphics.Bitmap

import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*

import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.core.content.FileProvider
import com.menadev.tourismapp.databinding.ActivityNewsBinding
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.layout_list_item.*
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.nio.file.OpenOption

class NewsActivity : AppCompatActivity() {
    private lateinit var image: ImageView
    private lateinit var binding: ActivityNewsBinding
    @SuppressLint("SetWorldReadable")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        supportActionBar?.show()
        image = findViewById(R.id.image_heading)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        Gravity.CENTER
        getColor(R.color.graphBgWhite)
        setTheme(R.style.Theme1_TourismApp)
        val headingNews: TextView = findViewById(R.id.heading)
        val mainNews: TextView = findViewById(R.id.news)
        val imageNews: ImageView = findViewById(R.id.image_heading)
        val bundle: Bundle? = intent.extras
        val heading = bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val news = bundle.getString("news")
        val loc =bundle.getString("tvLocation")

        headingNews.text = heading
        mainNews.text = news
        imageNews.setImageResource(imageId)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_news,menu)
        val item = menu?.findItem(R.id.search_action)





        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.About_Nav -> startActivity(Intent(this, AboutActivity::class.java))

        }

        return super.onOptionsItemSelected(item)
    }

    }















