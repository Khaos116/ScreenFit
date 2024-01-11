package com.cc.fits

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    //ScreenFitUtils.printScreenFitInfo()
    findViewById<TextView>(R.id.tvInfo).text = getString(R.string.sss)
  }
}