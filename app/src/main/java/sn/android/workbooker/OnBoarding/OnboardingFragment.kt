package sn.android.workbooker.OnBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_onboarding.view.*
import sn.android.workbooker.R
import sn.android.workbooker.adapter.ViewPagerAdapter
import sn.android.workbooker.screen.FirstFragment
import sn.android.workbooker.screen.SecondFragment
import sn.android.workbooker.screen.ThirdFragment

class OnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_onboarding, container, false)
        val fragmentList = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment()
        )
        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewPagerId.adapter = adapter

        return view
    }
}