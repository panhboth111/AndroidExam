package com.example.startactivityforresult

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val REQUEST_CODE = 200
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mIntent = Intent(this,SecondActivity::class.java)
        var mBundle = Bundle()
        send.setOnClickListener {
            mBundle.putInt("num1",num1.text.toString().toInt())
            mBundle.putInt("num2",num2.text.toString().toInt())
            mIntent.putExtra("mainData",mBundle)
            startActivityForResult(mIntent,REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==REQUEST_CODE && resultCode==Activity.RESULT_OK){
            var result = data?.getIntExtra("secondData",0)
            Toast.makeText(this,"$result",Toast.LENGTH_SHORT).show()
        }
    }
}
