package com.example.rescueradar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class Register_new_Agency : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_new_agency)

        val submit = findViewById<Button>(R.id.getOtp)
        submit.setOnClickListener {

            Toast.makeText(this, "New admin registered succesfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this,district_home_page_admin::class.java)
            startActivity(intent)
        }
    }
}