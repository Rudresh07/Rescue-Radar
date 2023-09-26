package com.example.rescueradar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FAQ : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var FAQ_question:ArrayList<FAQ_data>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        myRecyclerView = findViewById(R.id.faqRecyclerView)

        val Question = arrayOf(
            getString(R.string.faq_1_question),
            getString(R.string.faq_2_question),
            getString(R.string.faq_3_question),
            getString(R.string.faq_4_question),
            getString(R.string.faq_5_question),
            getString(R.string.faq_6_question),
            getString(R.string.faq_7_question),
            getString(R.string.faq_8_question),
            getString(R.string.faq_9_question),
            getString(R.string.faq_10_question),
            getString(R.string.faq_11_question),
            getString(R.string.faq_13_question),
            getString(R.string.faq_14_question),
            getString(R.string.faq_15_question)
        )

        val Answer = arrayOf(
            getString(R.string.faq_1_answer),
            getString(R.string.faq_2_answer),
            getString(R.string.faq_3_answer),
            getString(R.string.faq_4_answer),
            getString(R.string.faq_5_answer),
            getString(R.string.faq_6_answer),
            getString(R.string.faq_7_answer),
            getString(R.string.faq_8_answer),
            getString(R.string.faq_9_answer),
            getString(R.string.faq_10_answer),
            getString(R.string.faq_11_answer),
            getString(R.string.faq_13_answer),
            getString(R.string.faq_14_answer),
            getString(R.string.faq_15_answer)
        )

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        FAQ_question = arrayListOf<FAQ_data>()

        for (index in Question.indices)
        {
            val questionfaq = FAQ_data(Question[index],Answer[index])
            FAQ_question.add(questionfaq)
        }

        myRecyclerView.adapter = Faq_Adapter(FAQ_question)

    }
}