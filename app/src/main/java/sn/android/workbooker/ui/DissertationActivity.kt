package sn.android.workbooker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import sn.android.workbooker.R
import sn.android.workbooker.adapter.TapViewAdapter

class DissertationActivity : AppCompatActivity() {

    var tabLayout: TabLayout? = null
    var viewPager: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dissertation)

        tabLayout = findViewById(R.id.tab_layout)
        viewPager = findViewById(R.id.pager)

        viewPager!!.adapter = TapViewAdapter()
        TabLayoutMediator(tabLayout!!, viewPager!!) {
                tab, position -> tab.setText("Tab $position")
        }.attach()

    }
}