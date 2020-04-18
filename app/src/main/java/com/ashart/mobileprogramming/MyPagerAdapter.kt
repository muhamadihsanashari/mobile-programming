package com.ashart.mobileprogramming

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.ashart.mobileprogramming.fragments.FirstFragment
import com.ashart.mobileprogramming.fragments.SecondFragment
import com.ashart.mobileprogramming.fragments.ThridFragment

class MyPagerAdapter(fm : FragmentManager): FragmentPagerAdapter(fm) {

    private val pages = listOf(
        FirstFragment(),
        SecondFragment(),
        ThridFragment()
    )
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> "Thrid Tab"
        }
    }


}