package com.infinity.navigationsample.utils

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

@BindingAdapter("poster")
fun loadPoster(view: ImageView, url: String) {
    Glide.with(view).load("https://image.tmdb.org/t/p/original/$url").diskCacheStrategy(
        DiskCacheStrategy.ALL).into(view)
}

fun ProgressBar.hide(){
    this.visibility= View.INVISIBLE
}
fun ProgressBar.show(){
    this.visibility= View.VISIBLE
}
fun Context.toast(message: CharSequence) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()