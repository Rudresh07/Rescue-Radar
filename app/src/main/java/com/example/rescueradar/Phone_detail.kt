package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rescueradar.databinding.ActivityPhoneDetailBinding

class Phone_detail : AppCompatActivity() {

    var binding: ActivityPhoneDetailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneDetailBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        binding?.getOtp?.setOnClickListener {

            val intent = Intent(this,OTP::class.java)
            startActivity(intent)
        }
    }
}