package sn.android.workbooker.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_first.view.*
import sn.android.workbooker.R

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View =  inflater.inflate(R.layout.fragment_first, container, false)

        val viewpager = activity?.findViewById<ViewPager2>(R.id.viewPagerId)
        view.next_txt.setOnClickListener{
            viewpager?.currentItem = 1
        }
        return view
    }

}