package com.example.rescueradar

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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

        val receivedIntent = intent
        val isFlagReceived = receivedIntent.getBooleanExtra("FlagValue", false)



        if(isFlagReceived == true)
        {

            val Alertmessage = getString(R.string.ConfirmationMessage)


            val dialog = Dialog(this).apply {
                setContentView(R.layout.dialogue_box_confirmation)

                // Find the button in the layout
                val dialogButton = findViewById<Button>(R.id.okay)
                val message = findViewById<TextView>(R.id.tvalertmsg)

                message.text = Alertmessage

                // Set a click listener for the button
                dialogButton.setOnClickListener {
                    // Dismiss the dialog
                    dismiss()

                    // Navigate to the next screen (replace with your own logic)

                }
            }

            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            // Show the dialog
            dialog.show()
        }



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