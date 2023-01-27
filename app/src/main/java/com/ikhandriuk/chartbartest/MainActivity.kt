package com.ikhandriuk.chartbartest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var barList: java.util.ArrayList<BarEntry>
    lateinit var barDataSet: BarDataSet
    lateinit var barData: BarData

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Name of Statiton"

        barList = ArrayList()
        barList.add(BarEntry(1f, 300f))
        barList.add(BarEntry(2f, 450f))
        barList.add(BarEntry(3f, 150f))
        barList.add(BarEntry(4f, 200f))
        barList.add(BarEntry(5f, 600f))
        barList.add(BarEntry(6f, 450f))
        barList.add(BarEntry(7f, 800f))
        barList.add(BarEntry(8f, 550f))
        barDataSet = BarDataSet(barList, "Energy")
        barData = BarData(barDataSet)
        barChart.data=barData
        barDataSet.setColors(ColorTemplate.JOYFUL_COLORS,250)
        barDataSet.valueTextColor= Color.BLACK
        barDataSet.valueTextSize=15f

    }
}