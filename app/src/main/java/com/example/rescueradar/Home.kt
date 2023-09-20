package com.example.rescueradar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.example.rescueradar.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    var binding:ActivityHomeBinding? = null
    //this is file where we set the fragment to show
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        binding?.homeFrag?.setOnClickListener {

            replaceFragment(homePage())
        }
        binding?.settingFrag?.setOnClickListener {

            replaceFragment(Settings_page())
        }
        binding?.optionFrag?.setOnClickListener {

            replaceFragment(Option_page())
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val  fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment1,fragment)
        fragmentTransaction.commit()

    }
}