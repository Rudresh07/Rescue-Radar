package com.example.rescueradar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Faq_Adapter(var faqs:List<FAQ_data>) :RecyclerView.Adapter<Faq_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.faq_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val faq = faqs[position]

        holder.questionTextView.text = faq.question
        holder.answerTextView.text = faq.answer
    }

    override fun getItemCount(): Int = faqs.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val questionTextView: TextView = itemView.findViewById<TextView>(R.id.questionTextView)
        val answerTextView: TextView = itemView.findViewById<TextView>(R.id.answerTextView)
    }
}
