package com.example.rescueradar


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmergencyDataAdapter(private val emergencyList: List<emergencyData>) :
    RecyclerView.Adapter<EmergencyDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.emergency_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val userData = emergencyList[position]

        holder.userPhoneTextView.text = userData.userPhone
        holder.userNameTextView.text = userData.userName
        holder.emergencyTypeTextView.text = userData.emergencyType
        holder.userLocationTextView.text = userData.userLocation
        holder.emergencyDateTextview.text = userData.emergencyDate
    }

    override fun getItemCount(): Int {
        return emergencyList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userPhoneTextView: TextView = itemView.findViewById<TextView>(R.id.UserPhone)
        val userNameTextView: TextView = itemView.findViewById<TextView>(R.id.UserName)
        val emergencyTypeTextView: TextView = itemView.findViewById<TextView>(R.id.emergencyType)
        val userLocationTextView: TextView = itemView.findViewById<TextView>(R.id.UserLocation)
        val emergencyDateTextview:TextView = itemView.findViewById<TextView>(R.id.emergencyDate)
    }
}