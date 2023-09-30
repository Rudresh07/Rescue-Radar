package com.example.rescueradar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.rescueradar.databinding.ActivityLoginAsAdminBinding

class loginAsAdmin : AppCompatActivity() {
    var binding:ActivityLoginAsAdminBinding? = null
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginAsAdminBinding.inflate(layoutInflater)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.darkGreen2, theme)
        }
        val view = binding?.root
        setContentView(view)

        val intent = intent
        val message = intent.getStringExtra("UserType")


        binding?.getOtp?.setOnClickListener {

            if (message == "Admin")
            {
                val intent = Intent(this,AdminPage::class.java)
                startActivity(intent)
                finish()
                //we need to finish the code once moving forward also backend to be implemented here
            }

            if (message == "DistrictAdmin")
            {
                val intent = Intent(this,DIstrictAdminPage::class.java)
                startActivity(intent)
                finish()
                //we need to finish the code once moving forward also backend to be implemented here
            }


        }
    }
}