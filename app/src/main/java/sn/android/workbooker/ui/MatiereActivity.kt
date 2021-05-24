package sn.android.workbooker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import sn.android.workbooker.R
import sn.android.workbooker.adapter.MatiereViewPagerAdapter
import sn.android.workbooker.adapter.ViewPagerAdapter
import sn.android.workbooker.matiere_fragment.FrancaisFragment
import sn.android.workbooker.matiere_fragment.GeographieFragment
import sn.android.workbooker.matiere_fragment.HistoireFragment
import sn.android.workbooker.matiere_fragment.PhilosophieFragment
import sn.android.workbooker.type_de_sujet.CommentaireFragment
import sn.android.workbooker.type_de_sujet.DissertationFragment
import sn.android.workbooker.type_de_sujet.ResumeFragment

class MatiereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matiere)

        val fragmentList = arrayListOf(
            PhilosophieFragment(),
            FrancaisFragment(),
            HistoireFragment(),
            GeographieFragment()
        )

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout_matiere)
        val viewPager = findViewById<ViewPager2>(R.id.pager_matiere)
        val adaptermatiere = MatiereViewPagerAdapter(fragmentList, supportFragmentManager, lifecycle)

        viewPager.adapter = adaptermatiere
        TabLayoutMediator(tabLayout!!, viewPager!!){
            tab, position ->
            when(position){
                0 -> {
                    tab.text = "Philosophie"
                }
                1 -> {
                    tab.text = "Francais"
                }
                2 -> {
                    tab.text = "Histoire"
                }
                3 -> {
                    tab.text = "Géographie"
                }
            }
        }.attach()
    }
}