package com.example.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var pref = getSharedPreferences("DATA",Context.MODE_PRIVATE)
        var fname = pref.getString("fname","")
        var lname = pref.getString("lname","")
        Toast.makeText(this,"${fname} ${lname}",Toast.LENGTH_SHORT).show()
    }
}
