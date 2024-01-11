package com.cc.fits

import android.util.Log

/**
 * drawable-ldpi：低密度（Low Density）屏幕，对应约 120 dpi
 * drawable-mdpi：中密度（Medium Density）屏幕，对应约 160 dpi
 * drawable-hdpi：高密度（High Density）屏幕，对应约 240 dpi
 * drawable-xhdpi：超高密度（Extra High Density）屏幕，对应约 320 dpi
 * drawable-xxhdpi：超超高密度（Extra Extra High Density）屏幕，对应约 480 dpi
 * drawable-xxxhdpi：超超超高密度（Extra Extra Extra High Density）屏幕，对应约 640 dpi
 * Author:Khaos116
 * Date:2024/1/11
 * Time:16:42
 */
object ScreenFitUtils {
  //常用手机DPI对应的手机宽度
  private val mDpiScreens = mutableListOf(
    240 to 720,//标准
    260 to 720,
    300 to 900,
    320 to 720,//标准 也有768的
    360 to 1080,
    400 to 1080,
    420 to 1080,
    440 to 1080,
    480 to 1080,//标准 也有1440的
    560 to 1440,
    640 to 1440,//标准
  )

  //启动页背景图高宽比
  private val mRatio = 6035 / 1163f

  fun printScreenFitInfo() {
    mDpiScreens.forEach { p ->
      val w: Int = p.second
      val h: Int = (p.second * mRatio).toInt()
      Log.e("SIZE", "\n\n=======================drawable-${p.first}dpi=======================")
      //   android:width="1080px"
      //    android:height="2400px"
      Log.e("SIZE", "android:width=\"${w}px\"")
      Log.e("SIZE", "android:height=\"${h}px\"")
    }
  }
}