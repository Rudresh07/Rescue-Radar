package com.example.rescueradar

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Option_page.newInstance] factory method to
 * create an instance of this fragment.
 */
class Option_page : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    //in this i want to implement call and message features simultaneously

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_option_page, container, false)

        val police = view.findViewById<CardView>(R.id.callpolice)
        val ambulance = view.findViewById<CardView>(R.id.callambulance)
        val firefighter = view.findViewById<CardView>(R.id.callfirefighter)
        val mahilahelpline = view.findViewById<CardView>(R.id.callMahilaHelpline)
        val floodPrecaution = view.findViewById<CardView>(R.id.flood_Precaution)
        val firePrecaution = view.findViewById<CardView>(R.id.fire_Precaution)
        val stormPrecaution = view.findViewById<CardView>(R.id.storm_Precaution)
        val earthquackPrecaution = view.findViewById<CardView>(R.id.Earthquack_Precaution)
        val sosButton = view.findViewById<CardView>(R.id.Sos)
        val phoneNumber = "9576258797" // Replace with the recipient's phone number
        val message = "Hey checking wether sos button working perfectly fine or not." // Replace with your pre-written message



        sosButton.setOnClickListener {

            sendTextMessage(requireContext(), phoneNumber, message) // 'this' refers to the context of your activity or fragment

        }

        police.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                //here we need to write phone number of respective agency
                data = Uri.parse("tel:100")
            }
            startActivity(callIntent)
        }

        ambulance.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                //here we need to write phone number of respective agency
                data = Uri.parse("tel:102")
            }
            startActivity(callIntent)
        }

        firefighter.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                //here we need to write phone number of respective agency
                data = Uri.parse("tel:101")
            }
            startActivity(callIntent)
        }

        mahilahelpline.setOnClickListener {
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                //here we need to write phone number of respective agency
                data = Uri.parse("tel:1091")
            }
            startActivity(callIntent)
        }
        firePrecaution.setOnClickListener {

            val intent = Intent(requireContext(),Precautionary_Measure::class.java)
            intent.putExtra("calamity","Fire")

            startActivity(intent)
        }

        stormPrecaution.setOnClickListener {

            val intent = Intent(requireContext(),Precautionary_Measure::class.java)
            intent.putExtra("calamity","Storm")

            startActivity(intent)
        }

        floodPrecaution.setOnClickListener {

            val intent = Intent(requireContext(),Precautionary_Measure::class.java)
            intent.putExtra("calamity","Flood")

            startActivity(intent)
        }
        earthquackPrecaution.setOnClickListener {

            val intent = Intent(requireContext(),Precautionary_Measure::class.java)
            intent.putExtra("calamity","Earthquack")

            startActivity(intent)
        }



        return view
    }

    fun sendTextMessage(context: Context, phoneNumber: String, message: String) {
        // Create an intent to open the default messaging app
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("smsto:$phoneNumber") // Set the recipient's phone number

        // Set the text message content
        intent.putExtra("sms_body", message)

        // Start the messaging app
        context.startActivity(intent)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Option_page.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Option_page().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}




