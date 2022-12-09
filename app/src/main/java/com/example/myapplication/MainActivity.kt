package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
     var isclicked :Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //setContentView(R.layout.activity_main)
      binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.progressBar.visibility = View.GONE
       binding.btSubmit.setOnClickListener{
           progressbar()
       }
    }

private fun progressbar(){
     binding.apply {
         if (isclicked){
            progressBar.visibility = View.VISIBLE
             btSubmit.setText("Stop")
             isclicked = false
         }else{
             progressBar.visibility = View.GONE
             btSubmit.setText("Start")
             isclicked = true
         }
     }
}


    }
