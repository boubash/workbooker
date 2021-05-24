package sn.android.workbooker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import sn.android.workbooker.R
import sn.android.workbooker.adapter.TapViewAdapter
import sn.android.workbooker.adapter.ViewPagerAdapter
import sn.android.workbooker.screen.FirstFragment
import sn.android.workbooker.screen.SecondFragment
import sn.android.workbooker.screen.ThirdFragment
import sn.android.workbooker.type_de_sujet.CommentaireFragment
import sn.android.workbooker.type_de_sujet.DissertationFragment
import sn.android.workbooker.type_de_sujet.ResumeFragment

class DissertationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dissertation)

        val fragmentList = arrayListOf(
            DissertationFragment(),
            CommentaireFragment(),
            ResumeFragment()
        )

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager = findViewById<ViewPager2>(R.id.pager)
        val adapter1 = ViewPagerAdapter(fragmentList, supportFragmentManager, lifecycle)

        viewPager.adapter = adapter1
        TabLayoutMediator(tabLayout!!, viewPager!!) {
                tab, position ->
            when(position){
                0 -> {
                    tab.text= "Dissertation"
                }
                1 -> {
                    tab.text = "Commentaire"
                }
                2 -> {
                    tab.text = "Résumé"
                }
            }
        }.attach()

    }
}