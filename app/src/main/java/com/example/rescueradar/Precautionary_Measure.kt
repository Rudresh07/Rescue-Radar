package com.example.rescueradar

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.annotation.RequiresApi
import com.example.rescueradar.databinding.ActivityPrecautionaryMeasureBinding


//in this i need to implement background that changes accordingly
class Precautionary_Measure : AppCompatActivity() {

    var binding: ActivityPrecautionaryMeasureBinding? = null
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrecautionaryMeasureBinding.inflate(layoutInflater)
        val view = binding?.root
        setContentView(view)

        val floodPrecaution = getString(R.string.FloodPrecaution)
        val firePrecaution = getString(R.string.FirePrecaution)
        val earthquackPrecaution = getString(R.string.EarthquakeMeasure)
        val stormPrecaution = getString(R.string.StormPrecaution)


        var disasterName = binding?.DisasterText
        var disasterPrecaution = binding?.disasterPrecautionaryMeasure
        val disasterLayout = binding?.cardviewDisaster

        val intent = intent
       var CalamityType = intent.getStringExtra("calamity")

        if (CalamityType=="Flood")
        {
            disasterName?.text = "Flood"
            disasterPrecaution?.text = Html.fromHtml(floodPrecaution.replace("\n", "<br/>"), Html.FROM_HTML_MODE_COMPACT)
            disasterLayout?.setBackgroundResource(R.drawable.flood)
        }

        else if (CalamityType=="Fire")
        {
            disasterName?.text = "Fire"
            disasterPrecaution?.text = Html.fromHtml(firePrecaution.replace("\n", "<br/>"), Html.FROM_HTML_MODE_COMPACT)
            disasterLayout?.setBackgroundResource(R.drawable.fire)
        }
       else if (CalamityType=="Earthquack")
        {
            disasterName?.text = "Earthquack"
            disasterPrecaution?.text = Html.fromHtml(earthquackPrecaution.replace("\n", "<br/>"), Html.FROM_HTML_MODE_COMPACT)
            disasterLayout?.setBackgroundResource(R.drawable.earthquack)
       }

        if (CalamityType=="Storm")
        {
            disasterName?.text = "Storm"
            disasterPrecaution?.text = Html.fromHtml(stormPrecaution.replace("\n", "<br/>"), Html.FROM_HTML_MODE_COMPACT)
            disasterLayout?.setBackgroundResource(R.drawable.storm)
        }

    }
}