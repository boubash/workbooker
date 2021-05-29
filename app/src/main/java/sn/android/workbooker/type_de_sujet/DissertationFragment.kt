package sn.android.workbooker.type_de_sujet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_dissertation.*
import sn.android.workbooker.R
import sn.android.workbooker.adapter.DissertationAdapter
import sn.android.workbooker.model.Dissertation

class DissertationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dissertation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dr = Dissertation("test dkm")
        var dissertations: ArrayList<Dissertation> = ArrayList()
        for (i in 1..5) {
            dissertations.add(dr)
        }

        recview_dissertation.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = DissertationAdapter(context, dissertations)
        }

    }
}