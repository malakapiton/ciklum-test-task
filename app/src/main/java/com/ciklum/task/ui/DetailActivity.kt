package com.ciklum.task.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.ciklum.task.R

class DetailActivity : AppCompatActivity() {

    private lateinit var fullSizeImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        fullSizeImage = findViewById(R.id.fullsize_image)

        val intent = intent
        val imageUrl = intent.getStringExtra("url")

        Glide.with(this).load(imageUrl).into(fullSizeImage)
    }
}