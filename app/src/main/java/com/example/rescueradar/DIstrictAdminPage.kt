package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.rescueradar.databinding.ActivityDistrictAdminPageBinding

class DIstrictAdminPage : AppCompatActivity() {
    var binding:ActivityDistrictAdminPageBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDistrictAdminPageBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment1, district_home_page_admin())
                .commit()
        }

        binding?.homeFrag?.setOnClickListener {

            replaceFragment(district_home_page_admin())
        }

        binding?.logout?.setOnClickListener{
            val intent = Intent(this,Choose_userType::class.java)
            startActivity(intent)
            finish()
        }


        }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val  fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment1,fragment)
        fragmentTransaction.commit()

    }
    }
