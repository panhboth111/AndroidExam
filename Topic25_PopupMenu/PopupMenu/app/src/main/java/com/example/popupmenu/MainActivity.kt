package com.example.popupmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            var popMen = PopupMenu(this,it)
            popMen.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.call -> Toast.makeText(this,"Calling....",Toast.LENGTH_SHORT).show()
                    R.id.sms -> Toast.makeText(this,"SMS....",Toast.LENGTH_SHORT).show()
                }
                true
            }
            popMen.inflate(R.menu.menu_items)
            popMen.show()
        }
    }
}
