package com.androchef.totellapp.ui.mainactivity

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.androchef.totellapp.ui.qrscanner.QRScannerFragment
import com.androchef.totellapp.ui.scanner_history.ScannedHistoryFragment

/**
 * Developed by Arnav 2021
 */
class MainPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                QRScannerFragment.newInstance()
            }

            1 -> {
                ScannedHistoryFragment.newInstance(ScannedHistoryFragment.ResultListType.ALL_RESULT)
            }

            2 -> {
                ScannedHistoryFragment.newInstance(ScannedHistoryFragment.ResultListType.FAVOURITE_RESULT)
            }

            else -> {
                QRScannerFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 3
    }
}
