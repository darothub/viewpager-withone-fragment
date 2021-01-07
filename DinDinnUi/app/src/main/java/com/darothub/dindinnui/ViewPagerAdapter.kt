package com.darothub.dindinnui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fm: FragmentActivity) : FragmentStateAdapter(fm) {

    private val fragList by lazy {
        arrayListOf<Fragment>(
            MainFragment.newInstance("Hello", "Fragment $0"),
            MainFragment.newInstance("Hello", "Fragment $1"),
            MainFragment.newInstance("Hello", "Fragment $2"),
            MainFragment.newInstance("Hello", "Fragment $3"),
            MainFragment.newInstance("Hello", "Fragment $4"),
            MainFragment.newInstance("Hello", "Fragment $5"),
            MainFragment.newInstance("Hello", "Fragment $6"),
            MainFragment.newInstance("Hello", "Fragment $7"),
            MainFragment.newInstance("Hello", "Fragment $8"),
            MainFragment.newInstance("Hello", "Fragment $9"),
            MainFragment.newInstance("Hello", "Fragment $10"),
            MainFragment.newInstance("Hello", "Fragment $11")
        )
    }
    override fun getItemCount(): Int {
        return fragList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragList[position]
    }
}