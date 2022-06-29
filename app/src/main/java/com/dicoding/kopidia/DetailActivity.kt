package com.dicoding.kopidia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_age"
        const val EXTRA_IMG = "extra_img"
        const val EXTRA_DETAIL = "extra_detail"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle("Detail")

        val tvNameReceived: TextView = findViewById(R.id.tv_item_name)
        val tvAboutReceived: TextView = findViewById(R.id.tv_item_detail)
        val imgItemPhoto: ImageView = findViewById(R.id.img_item_photo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val img = intent.getIntExtra(EXTRA_IMG, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        imgItemPhoto.setImageResource(img)
        tvNameReceived.text = name
        tvAboutReceived.text = detail
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}