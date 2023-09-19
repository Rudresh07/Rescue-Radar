package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rescueradar.databinding.ActivityMainBinding
import com.example.rescueradar.databinding.ActivityOtpBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var binding:ActivityMainBinding? = null
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        binding?.getOtp?.setOnClickListener {

            val intent = Intent(this,OTP::class.java)
            startActivity(intent)
        }

    }
}