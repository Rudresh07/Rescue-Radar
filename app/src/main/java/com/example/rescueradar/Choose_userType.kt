package com.example.rescueradar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.rescueradar.databinding.ActivityChooseUserTypeBinding

class Choose_userType : AppCompatActivity() {
    var binding:ActivityChooseUserTypeBinding? =null
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityChooseUserTypeBinding.inflate(layoutInflater)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.darkGreen2, theme)
        }
        val view = binding?.root
        setContentView(view)


        binding?.userButton?.setOnClickListener {

            val intent = Intent(this,Phone_detail::class.java)
            startActivity(intent)
            //this need to be on finish()

        }
        binding?.AdminButton?.setOnClickListener {

            val intent = Intent(this,loginAsAdmin::class.java)
            intent.putExtra("UserType","Admin")
            startActivity(intent)
            //this need to need on finish()

        }
        binding?.DistrictAuthorityButton?.setOnClickListener {

            val intent = Intent(this,loginAsAdmin::class.java)
            intent.putExtra("UserType","DistrictAdmin")
            startActivity(intent)
            //this need to be on finish()

        }

        //here i need to implement where we want to go after clicking the some card .
    }
}