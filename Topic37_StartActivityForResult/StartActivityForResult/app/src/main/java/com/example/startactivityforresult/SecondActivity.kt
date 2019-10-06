package com.example.startactivityforresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var bundle = intent.getBundleExtra("mainData")
        var num1 = bundle.getInt("num1")
        var num2 = bundle.getInt("num2")
        back.setOnClickListener {
            var i = Intent()
            var res = num1 + num2
            i.putExtra("secondData",res)
            setResult(Activity.RESULT_OK,i)
            finish()
        }
    }
}
