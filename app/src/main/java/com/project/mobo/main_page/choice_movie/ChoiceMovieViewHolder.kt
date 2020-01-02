package com.project.mobo.main_page.choice_movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import android.graphics.drawable.GradientDrawable
import com.project.mobo.R
import com.project.mobo.temp.ReserveMovie
import android.R.drawable
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.ContextCompat


class ChoiceMovieViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val ItemImage : ImageView=view.findViewById(R.id.imgMainItemPoster)
    val tvItemTitle : TextView =view.findViewById(R.id.tvMainItemTitle)
    val tvItemStar : TextView=view.findViewById(R.id.tvMainItemStar)

    fun bind(data: ReserveMovie){

        Glide.with(itemView)
            //.load("data:image/jpeg;base64,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")
            .load(data.movieImg)
            .into(ItemImage)
        tvItemTitle.text=data.movieName
        tvItemStar.text=data.movieScore.toString()

       //ItemImage.setBackground(corner)
        //imageView.setClipToOutline(true)

        //val drawable = data.poster.getDrawable(R.drawable.main_viewpager_corner) as GradientDrawable

        //ItemImage.background = drawable
        //ItemImage.clipToOutline = true

    }
}