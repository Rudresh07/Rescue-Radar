package com.example.rescueradar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.rescueradar.databinding.ActivityMainBinding
import com.example.rescueradar.databinding.ActivityOtpBinding

class OTP : AppCompatActivity() {

    var binding:ActivityOtpBinding? = null
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.darkGreen2, theme)
        }
        binding = ActivityOtpBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)


        binding?.getOtp?.setOnClickListener {

            //implement backend to get otp details

            val intent = Intent(this,Choose_Langauge::class.java)
            startActivity(intent)
            finish()
        }

    }
}