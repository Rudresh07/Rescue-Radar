package com.example.rescueradar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class Map_Fragment : Fragment(), OnMapReadyCallback {
    private var mapView: MapView? = null
    private var mGoogleMap: GoogleMap? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_map, container, false)
        mapView = root.findViewById(R.id.mapView)
        mapView?.onCreate(savedInstanceState)
        mapView?.getMapAsync(this)
        return root
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
