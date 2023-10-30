package com.example.rescueradar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class user_Map : AppCompatActivity(),OnMapReadyCallback {
    private var mGoogleMap:GoogleMap? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_map)


        var mapFragment = supportFragmentManager
            .findFragmentById(R.id.user_map_fragment) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mGoogleMap = googleMap
        val markerOptions = MarkerOptions()
            .position(LatLng(21.053537, 73.616913))
            .title("District Panchayat Office, Ahwa")
        mGoogleMap!!.addMarker(markerOptions)

        // Move the camera to the marker's position
        val cameraUpdate = CameraUpdateFactory.newLatLngZoom(LatLng(21.053537, 73.616913), 16f)
       mGoogleMap!!.moveCamera(cameraUpdate)
        mGoogleMap!!.animateCamera(cameraUpdate)
    }
}