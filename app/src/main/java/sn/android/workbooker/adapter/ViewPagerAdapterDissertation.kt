package sn.android.workbooker.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapterDissertation(list: ArrayList<Fragment>,
                                   fm: FragmentManager,
                                   lifecycle: Lifecycle
) : FragmentStateAdapter(fm , lifecycle) {
    private val fragmentList : ArrayList<Fragment> = list
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        TODO("Not yet implemented")
        return fragmentList[position]
    }
}