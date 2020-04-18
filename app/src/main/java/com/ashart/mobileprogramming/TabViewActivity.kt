package com.ashart.mobileprogramming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tab_view.*

class TabViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_view)

        viewpager_main.adapter = MyPagerAdapter(supportFragmentManager)
        tabs_main.setupWithViewPager(viewpager_main)
    }
}
