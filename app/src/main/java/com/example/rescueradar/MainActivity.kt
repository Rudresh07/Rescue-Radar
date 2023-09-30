package com.example.rescueradar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.annotation.RequiresApi
import com.example.rescueradar.databinding.ActivityMainBinding
import com.example.rescueradar.databinding.ActivityOtpBinding

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Set the content view to the splash screen layout
        setContentView(R.layout.activity_main)

        // Delay for a few seconds and then move to the next screen
        Handler().postDelayed({
            val intent = Intent(this, Choose_userType::class.java)
            startActivity(intent)
            finish() // Close the main activity so the user can't go back to it
        }, 3000) // Delay for 3 seconds (adjust as needed)


    }
}