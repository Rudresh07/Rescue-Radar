package com.example.rescueradar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutUs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        var textAboutUs = findViewById<TextView>(R.id.aboutusText)
        //create a string for about us and implement it to the this page
    }
}