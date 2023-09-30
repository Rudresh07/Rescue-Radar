package com.example.rescueradar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmergencyCases : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var adapter: EmergencyDataAdapter
    private lateinit var userDataList: List<emergencyData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_cases)


        // Initialize RecyclerView with the correct id
        recyclerView = findViewById(R.id.EmergencyRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)


        // Initialize your list of UserData (replace this with your data)
        userDataList = listOf(
            emergencyData("888888888", "Sumit Yadav", "Flood", "XYZ, colony Ghandinagar", "12/03/22"),
            emergencyData("7777777777","Sohail Ansari","Fire","XYZ,New Delhi","13/07/23"),
            emergencyData("6666666666","Sohail Khan","Fire","XYZ,New Delhi","13/07/23"),
        )

        // Initialize and set the adapter
        adapter = EmergencyDataAdapter(userDataList)
        recyclerView.adapter = adapter



    }
}