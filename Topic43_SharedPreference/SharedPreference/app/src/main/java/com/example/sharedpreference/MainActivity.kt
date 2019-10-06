package com.example.sharedpreference

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun saveData(v:View){
        var i = Intent(this,SecondActivity::class.java)
        var pref = getSharedPreferences("DATA", Context.MODE_PRIVATE)
        var editor = pref.edit()
        editor.putString("fname",fname.text.toString())
        editor.putString("lname",lname.text.toString())
        editor.apply()
        Toast.makeText(this,"SAVED",Toast.LENGTH_SHORT).show()
        startActivity(i)
    }
}
