package com.example.aswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (compoundButton.isChecked) Toast.makeText(this,"ON",Toast.LENGTH_SHORT).show()
            else Toast.makeText(this,"OFF",Toast.LENGTH_SHORT).show()
        }
    }
}
