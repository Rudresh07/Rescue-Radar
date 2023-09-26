package com.example.rescueradar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Settings_page.newInstance] factory method to
 * create an instance of this fragment.
 */
class Settings_page : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_settings_page, container, false)
        // Inflate the layout for this fragment

        val editProfile = view.findViewById<TextView>(R.id.editprofile)
        val changeLangauge = view.findViewById<TextView>(R.id.langauge)
        val FAQquestion = view.findViewById<CardView>(R.id.faq)





        editProfile.setOnClickListener {

            starteditProfile()
        }

        changeLangauge.setOnClickListener {

            startchangeLangauge()
        }

        FAQquestion.setOnClickListener {
            val intent = Intent(requireActivity(),FAQ::class.java)
            Toast.makeText(requireActivity(), "you clicked me", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }




        return view
    }

    private fun startchangeLangauge() {

    }

    private fun starteditProfile() {
        val intent = Intent(requireActivity(),editProfile::class.java)
        startActivity(intent)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Settings_page.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Settings_page().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}