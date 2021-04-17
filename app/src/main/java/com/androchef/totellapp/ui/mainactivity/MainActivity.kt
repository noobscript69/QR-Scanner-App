package com.androchef.totellapp.ui.mainactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.androchef.totellapp.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_qr_result_show.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewPager()
        setBottomViewListener()
        setViewPagerListener()
//      LinkSetup()
    }

//   private fun LinkSetup(){
//
//      val customer_data = Link( show
//       )
//          .setTextColor(Color.GREEN)
//            .setTextColorOfHighlightedLink(Color.BLACK)
//            .setHighlightAlpha(.4f)
//            .setUnderlined(false)
//            .setBold(true)
//          .setOnClickListener {
//                Toast.makeText(this, "Data of the Assosiate", Toast.LENGTH_SHORT).show()
//           }
//        scannedText.applyLinks(customer_data)
//    }

    private fun setViewPager() {
        viewPager.adapter = MainPagerAdapter(supportFragmentManager)
        viewPager.offscreenPageLimit = 2
    }

    private fun setBottomViewListener() {
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.qrScanMenuId -> {
                    viewPager.currentItem = 0
                }
                R.id.scannedResultMenuId -> {
                    viewPager.currentItem = 1

                }
                R.id.favouriteScannedMenuId -> {
                    viewPager.currentItem = 2
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }


    private fun setViewPagerListener() {
        viewPager.setOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener() {
            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        bottomNavigationView.selectedItemId = R.id.qrScanMenuId
                    }
                    1 -> {
                        bottomNavigationView.selectedItemId = R.id.scannedResultMenuId
                    }
                    2 -> {
                        bottomNavigationView.selectedItemId = R.id.favouriteScannedMenuId
                    }
                }
            }
        })
    }
}