package com.example.humbleman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.humbleman.fragments.HomeFragment

class DetailActivity : AppCompatActivity() {

    private lateinit var homeFragment: HomeFragment

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_RATING ="extra_rating"
        const val EXTRA_RELEASE = "extra_release"
        const val EXTRA_GENRE = "extra_genre"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        var tvName: TextView = findViewById(R.id.tv_item_name)
        var tvDetail: TextView = findViewById(R.id.tv_item_detail)
        var tvGenre: TextView = findViewById(R.id.tv_item_genre)
        var tvRating: TextView = findViewById(R.id.tv_item_rating)
        var tvRelease: TextView = findViewById(R.id.tv_item_released)
        var imgPhoto: ImageView = findViewById(R.id.img_item)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val genre = intent.getStringExtra(EXTRA_GENRE)
        val rating = intent.getStringExtra(EXTRA_RATING)
        val release = intent.getStringExtra(EXTRA_RELEASE)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        tvName.text = name
        tvDetail.text = detail
        tvGenre.text = genre
        tvRating.text = rating
        tvRelease.text = release


        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(imgPhoto)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var tvName: TextView = findViewById(R.id.tv_item_name)
        val name = intent.getStringExtra(EXTRA_NAME)
        tvName.text = name

        var tvDetail: TextView = findViewById(R.id.tv_item_detail)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        tvDetail.text = detail

        when (item.itemId) {
            R.id.share_button ->{
                val sendIntent: Intent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Synopsis " + name + "\n" + detail)
                    type = "text/plain"
                }
                startActivity(Intent.createChooser(sendIntent, null))
        }

        }
        return super.onOptionsItemSelected(item)
    }
}