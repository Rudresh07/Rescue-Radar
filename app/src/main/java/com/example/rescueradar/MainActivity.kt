package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.rescueradar.databinding.ActivityMainBinding
import com.example.rescueradar.databinding.ActivityOtpBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to the splash screen layout
        setContentView(R.layout.activity_main)

        // Delay for a few seconds and then move to the next screen
        Handler().postDelayed({
            val intent = Intent(this, Phone_detail::class.java)
            startActivity(intent)
            finish() // Close the main activity so the user can't go back to it
        }, 3000) // Delay for 3 seconds (adjust as needed)


    }
}