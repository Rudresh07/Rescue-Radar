package com.example.rescueradar

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [homePage.newInstance] factory method to
 * create an instance of this fragment.
 */
class homePage : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home_page, container, false)
        // Inflate the layout for this fragment
        val onlineEmergency = view?.findViewById<LinearLayout>(R.id.EmergencyReporting)
        val offlineReporting = view?.findViewById<CardView>(R.id.OfflineEmergency)
        val normalReporting = view?.findViewById<CardView>(R.id.NormalReporting)
        val HelpMap = view?.findViewById<CardView>(R.id.HelpMap)
        val Alertmessage = getString(R.string.Popup)

        fun navigateToNextScreen() {
            val intent = Intent(requireActivity(), choose_disaster_type::class.java)
            startActivity(intent)

        }
        onlineEmergency?.setOnClickListener {

            // Inside your Fragment class

                // Create the dialog
                val dialog = Dialog(requireActivity()).apply {
                    setContentView(R.layout.coustom_dailogue)

                    // Find the button in the layout
                    val dialogButton = findViewById<Button>(R.id.okay)
                    val message = findViewById<TextView>(R.id.tvalertmsg)

                    message.text = Alertmessage

                    // Set a click listener for the button
                    dialogButton.setOnClickListener {
                        // Dismiss the dialog
                        dismiss()

                        // Navigate to the next screen (replace with your own logic)
                        navigateToNextScreen()
                    }
                }

            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                // Show the dialog
                dialog.show()


        }

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment homePage.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            homePage().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}