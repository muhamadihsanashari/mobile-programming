package com.ashart.mobileprogramming

import android.R.layout.simple_list_item_1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val data = listOf("Kotlin","Java","Dart","Java","PHP","Phyton")

        lv_mahasiswa.adapter = ArrayAdapter(this, simple_list_item_1, data)
    }
}
