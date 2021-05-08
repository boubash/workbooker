package sn.android.workbooker.screen

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_third.view.*
import sn.android.workbooker.R
import sn.android.workbooker.ui.NiveauActivity

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewPagerId)

        view.btn_start.setOnClickListener{
            val intent = Intent(activity, NiveauActivity::class.java)
            startActivity(intent)
        }

        return view
    }

}