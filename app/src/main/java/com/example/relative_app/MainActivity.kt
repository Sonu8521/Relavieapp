package com.example.relative_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val year1id=findViewById<Spinner>(R.id.year1)
        val Data=arrayOf<String>("","29 y.0","30 y.0","20 y.0")
        val SpinnerAdpter= ArrayAdapter(this,R.layout.layout,Data)
        year1id.adapter=SpinnerAdpter

        val gender1id=findViewById<Spinner>(R.id.gender1)
        val Data1=arrayOf<String>("","Male","Female")
        val SpinnerAdpter1= ArrayAdapter(this,R.layout.layout,Data1)
        gender1id.adapter=SpinnerAdpter1

        val country1id=findViewById<Spinner>(R.id.country1)
        val Data2=arrayOf<String>("","India","Pakistan","Nepal")
        val SpinnerAdpter2= ArrayAdapter(this,R.layout.layout,Data2)
        country1id.adapter=SpinnerAdpter2

    }
}