package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
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

        binding.btSubmit.setOnClickListener {
            getStudent(Student(id = 1, name = "Amit Bidlan", email = "B@gmail.com"))
        }


    }

private fun getStudent(student: Student): Student? {
    binding.apply {
        if (isclicked) {

            tvName.setText(student?.name)
            tvEmail.setText(student?.email)
            progressBar.visibility = View.GONE
            isclicked = false
            btSubmit.setText("Clear")
        } else {
            tvName.setText("")
            tvEmail.setText("")
            progressBar.visibility = View.VISIBLE
            isclicked = true
            btSubmit.setText("Fetch")
        }
    }
    return null

}


    }
