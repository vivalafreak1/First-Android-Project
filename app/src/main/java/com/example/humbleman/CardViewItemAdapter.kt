package com.example.humbleman

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.humbleman.DetailActivity.Companion.EXTRA_NAME
import com.example.humbleman.fragments.FavouritesFragment

class CardViewItemAdapter(private val listItem: ArrayList<Item>) : RecyclerView.Adapter<CardViewItemAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewItemAdapter.CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    override fun onBindViewHolder(holder: CardViewItemAdapter.CardViewViewHolder, position: Int) {
        val item = listItem[position]

        Glide.with(holder.itemView.context)
            .load(item.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.tvName.text = item.name
        holder.tvDetail.text = item.detail

        holder.tvCategory.text = item.category
        holder.tvRating.text = item.rating
        holder.tvRelease.text = item.release
        holder.tvGenre.text = item.genre

        //holder.btnFavorite.setOnClickListener { Toast.makeText(holder.itemView.context, "Favorite " + listItem[holder.adapterPosition].name, Toast.LENGTH_SHORT).show() }
        //ISIAN 2
        holder.btnFavorite.setOnCheckedChangeListener{ checkBox, isChecked ->
            if (isChecked) {
                Toast.makeText(holder.itemView.context, "Kamu Menambah " + listItem[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(holder.itemView.context, "Kamu Menghapus " + listItem[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
            }
        }
        //BATAS 2

        /*holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Share " + listItem[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }*/

        //ISIAN
        val xContext = holder.itemView.context
        holder.itemView.setOnClickListener{
            val moveDataItem = Intent(xContext, DetailActivity::class.java)
            moveDataItem.putExtra(DetailActivity.EXTRA_NAME, item.name)
            moveDataItem.putExtra(DetailActivity.EXTRA_DETAIL, item.detail)
            moveDataItem.putExtra(DetailActivity.EXTRA_PHOTO, item.photo)
            moveDataItem.putExtra(DetailActivity.EXTRA_RATING, item.rating)
            moveDataItem.putExtra(DetailActivity.EXTRA_RELEASE, item.release)
            moveDataItem.putExtra(DetailActivity.EXTRA_GENRE, item.genre)
            xContext.startActivity(moveDataItem)
        //BATAS
        }
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)

        var tvCategory: TextView = itemView.findViewById(R.id.tv_item_category)
        var tvRating: TextView = itemView.findViewById(R.id.tv_item_rating)
        var tvRelease: TextView = itemView.findViewById(R.id.tv_item_released)
        var tvGenre: TextView = itemView.findViewById(R.id.tv_item_genre)

        var btnFavorite: CheckBox = itemView.findViewById(R.id.btn_set_favorite)
        //var btnShare: Button = itemView.findViewById(R.id.btn_set_share)

    }
}
