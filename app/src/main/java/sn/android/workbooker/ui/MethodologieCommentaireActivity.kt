package sn.android.workbooker.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import sn.android.workbooker.R
import sn.android.workbooker.adapter.ViewPagerAdapter
import sn.android.workbooker.methodologie.ConclusionFragment
import sn.android.workbooker.methodologie.DeveloppementFragment
import sn.android.workbooker.methodologie.IntroductionFragment

class MethodologieCommentaireActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_methodologie_commentaire)

        val fragmentList = arrayListOf(
            IntroductionFragment(),
            DeveloppementFragment(),
            ConclusionFragment()
        )

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout_method_com)
        val viewPager = findViewById<ViewPager2>(R.id.pager_method_com)
        val adapter1 = ViewPagerAdapter(fragmentList, supportFragmentManager, lifecycle)

        viewPager.adapter = adapter1
        TabLayoutMediator(tabLayout!!, viewPager!!) {
                tab, position ->
            when(position){
                0 -> {
                    tab.text=("Introduction")
                }
                1 -> {
                    tab.text = "Developpement"
                }
                2 -> {
                    tab.text = "Conclusion"
                }
            }
        }.attach()
    }
}