package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rescueradar.databinding.ActivityChooseLangaugeBinding

class Choose_Langauge : AppCompatActivity() {
    var binding: ActivityChooseLangaugeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityChooseLangaugeBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        binding?.Proceed?.setOnClickListener {

            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}