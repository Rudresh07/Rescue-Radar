package com.example.rescueradar

import android.content.Intent
import android.content.SharedPreferences
import android.content.res.Configuration
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import com.example.rescueradar.databinding.ActivityChooseLangaugeBinding
import java.util.*

class Choose_Langauge : AppCompatActivity() {
    private var binding: ActivityChooseLangaugeBinding? = null
    private val languages = arrayOf("English", "हिंदी") // Add more languages as needed
    private lateinit var popupMenu: PopupMenu
    private lateinit var sharedPreferences: SharedPreferences

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseLangaugeBinding.inflate(layoutInflater)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = resources.getColor(R.color.darkGreen2, theme)
        }
        val view = binding?.root
        setContentView(view)

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("MyAppPrefs", MODE_PRIVATE)

        // Initialize the language Spinner
        popupMenu = PopupMenu(this, binding!!.spinner1)
        for (language in languages) {
            popupMenu.menu.add(language)
        }

        // Set the initial language text
        val selectedLanguage = sharedPreferences.getString("language", "English")
        binding?.spinner1?.text = selectedLanguage

        // Handle spinner click
        binding?.spinner1?.setOnClickListener { view ->
            // Show the PopupMenu
            popupMenu.show()
        }

        // Handle item selection from PopupMenu
        popupMenu.setOnMenuItemClickListener { menuItem ->
            val selectedLanguage = menuItem.title.toString()
            binding?.spinner1?.text = selectedLanguage
            // You can perform actions based on the selected language here
            Toast.makeText(this, "Selected Language: $selectedLanguage", Toast.LENGTH_SHORT).show()

            setLocale(selectedLanguage)
            // Save the selected language preference
            sharedPreferences.edit().putString("language", selectedLanguage).apply()
            true
        }

        // Proceed button click listener
        binding?.Proceed?.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setLocale(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val configuration = Configuration()
        configuration.locale = locale
        resources.updateConfiguration(configuration, resources.displayMetrics)

        // Check if the selected language is different from the current one
        if (language != getCurrentLanguage()) {
            // Restart the activity to apply the language change
            recreate()
        }
    }

    private fun getCurrentLanguage(): String {
        return resources.configuration.locale.displayLanguage
    }
}
