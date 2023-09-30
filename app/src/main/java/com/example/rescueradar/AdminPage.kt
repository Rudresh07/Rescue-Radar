package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rescueradar.databinding.ActivityAdminPageBinding
import com.example.rescueradar.databinding.ActivityDistrictAdminPageBinding

class AdminPage : AppCompatActivity() {
    var binding: ActivityAdminPageBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdminPageBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        if (savedInstanceState == null) {
            // Set the default fragment here
            val defaultFragment = Admin_home_page_fragment()
            replaceFragment(defaultFragment)
        }

        // Add click listener to your navigation button
        binding?.homeFrag?.setOnClickListener {
            val fragment = Admin_home_page_fragment()
            replaceFragment(fragment)
        }
        binding?.mapfrag?.setOnClickListener {
            replaceFragment(Map_Fragment())
        }
        binding?.logout?.setOnClickListener{
            val intent = Intent(this,Choose_userType::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment1, fragment)
        fragmentTransaction.commit()
    }
}