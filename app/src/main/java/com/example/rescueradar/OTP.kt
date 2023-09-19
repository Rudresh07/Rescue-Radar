package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rescueradar.databinding.ActivityMainBinding
import com.example.rescueradar.databinding.ActivityOtpBinding

class OTP : AppCompatActivity() {

    var binding:ActivityOtpBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)


        binding?.getOtp?.setOnClickListener {

            val intent = Intent(this,Choose_Langauge::class.java)
            startActivity(intent)
        }

    }
}