package com.example.mylearn

import android.util.Log
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load


//@BindingAdapter("loadImageFromUrl")
//fun ImageView.loadImageFromUrl(url: String) {
//    this.load(url)
//}

class MyBindingAdaptor {
    companion object {
        @BindingAdapter("loadImageFromUrl", "displayTitle", requireAll = false)
        @JvmStatic
        fun ImageView.loadImageFromUrl(url: String, title: String) {
            this.load(url)
//            Log.e("taitest", title  "aa")
        }
    }
}