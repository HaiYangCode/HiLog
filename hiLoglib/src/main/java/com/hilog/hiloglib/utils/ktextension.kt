package com.hilog.hiloglib.utils

import android.content.Context
import android.util.DisplayMetrics
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.view.WindowManager
import java.text.SimpleDateFormat
import java.util.Locale


fun Int.dp2px(context: Context): Int {
    val density = context.resources.displayMetrics.density
    return (this * density).toInt()
}

fun getScreenWidth(context: Context): Int {
    val displayMetrics = context.resources.displayMetrics
    val screenWidth = displayMetrics.widthPixels
    return screenWidth
}


private val sdf = SimpleDateFormat("yy-MM--dd HH:mm:ss", Locale.CHINA)
fun Long.format(sdformat: SimpleDateFormat = sdf): String {
    return sdformat.format(this)
}


