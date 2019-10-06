package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sb1.max = 100
        sb2.max = 100
        sb1.setOnSeekBarChangeListener(this)
        sb2.setOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
        when(p0?.id){
           R.id.sb1 -> t1.text = sb1.progress.toString()
            R.id.sb2 -> t2.text = sb2.progress.toString()
        }
    }

    override fun onStartTrackingTouch(p0: SeekBar?) {
        when(p0?.id){
            R.id.sb1 -> Toast.makeText(this,"Bar1 starts",Toast.LENGTH_SHORT).show()
            R.id.sb2 -> Toast.makeText(this,"Bar2 starts",Toast.LENGTH_SHORT).show()
        }
    }

    override fun onStopTrackingTouch(p0: SeekBar?) {
        when(p0?.id){
            R.id.sb1 -> Toast.makeText(this,"Bar1 stops",Toast.LENGTH_SHORT).show()
            R.id.sb2 -> Toast.makeText(this,"Bar2 stops",Toast.LENGTH_SHORT).show()
        }
    }

}
