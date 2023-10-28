package com.example.rescueradar

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import com.example.rescueradar.databinding.ActivityChooseDisasterTypeBinding

class choose_disaster_type : AppCompatActivity() {

    var binding:ActivityChooseDisasterTypeBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseDisasterTypeBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

       val radioGroup = binding?.chooseDisaster
        val submit = binding?.Proceed
        val Alertmessage = getString(R.string.confirmation)


        radioGroup?.setOnCheckedChangeListener { _, _ ->
            // Check if any radio button in the group is selected
            val anySelected = radioGroup.checkedRadioButtonId != -1

            // Enable or disable the submit button based on the selection
            submit?.isEnabled = anySelected


        submit?.setOnClickListener {


            val dialog = Dialog(this).apply {
                setContentView(R.layout.coustom_dailogue)

                // Find the button in the layout
                val dialogButton = findViewById<Button>(R.id.okay)
                val message = findViewById<TextView>(R.id.tvalertmsg)

                message.text = Alertmessage



                // Set a click listener for the button
                dialogButton.setOnClickListener {


                    //here we need to implement code to send the message



                    // Dismiss the dialog
                    dismiss()


                    // Navigate to the next screen (replace with your own logic)

                    navigateToPreviousScreen()

                }
            }
            dialog.setTitle("Final Confirmation")

            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            // Show the dialog
            dialog.show()
        }


        }}

    private fun navigateToPreviousScreen() {

        finish()
    }
}
