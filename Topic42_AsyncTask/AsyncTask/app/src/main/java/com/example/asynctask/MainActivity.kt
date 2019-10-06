package com.example.asynctask

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun start(v:View){
        Downloader().execute()
    }
    inner class Downloader:AsyncTask<Void,String,Boolean>(){
        override fun doInBackground(vararg p0: Void?): Boolean {
            for(i in 1..100){
                publishProgress(i.toString())
                Thread.sleep(100)
            }
            return true
        }

        override fun onProgressUpdate(vararg values: String?) {
            super.onProgressUpdate(*values)
            textView.text = values[0]

        }

        override fun onPostExecute(result: Boolean?) {
            super.onPostExecute(result)
        }

    }
}
