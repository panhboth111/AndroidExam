package com.example.colormixer

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    var alphaColor = 0
    var redColor = 0
    var greenColor = 0
    var blueColor = 0
    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        when(p0?.id){
            R.id.alpha -> alphaColor = p1
            R.id.red -> redColor = p1
            R.id.green -> greenColor = p1
            R.id.blue -> blueColor = p1
        }
        btn?.setBackgroundColor(Color.argb(alphaColor,redColor,greenColor,blueColor))
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {

    }

    override fun onStopTrackingTouch(p0: SeekBar?) {

    }

    var btn:Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alpha.setOnSeekBarChangeListener(this)
        red.setOnSeekBarChangeListener(this)
        green.setOnSeekBarChangeListener(this)
        blue.setOnSeekBarChangeListener(this)
    }
    fun getButton(v:View){
        btn = findViewById(v.id) as Button
    }
}
