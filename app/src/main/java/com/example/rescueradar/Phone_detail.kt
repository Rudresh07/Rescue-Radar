package com.example.rescueradar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.rescueradar.databinding.ActivityPhoneDetailBinding

class Phone_detail : AppCompatActivity() {

    var binding: ActivityPhoneDetailBinding? = null
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.darkGreen2, theme)
        }
        binding = ActivityPhoneDetailBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        binding?.getOtp?.setOnClickListener {

            val intent = Intent(this,OTP::class.java)
            startActivity(intent)
            finish()
        }
    }
}