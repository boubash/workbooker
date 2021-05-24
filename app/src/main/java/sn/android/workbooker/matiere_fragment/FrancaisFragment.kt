package sn.android.workbooker.matiere_fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_francais.*
import kotlinx.android.synthetic.main.fragment_philosophie.*
import sn.android.workbooker.R
import sn.android.workbooker.adapter.DissertationAdapter
import sn.android.workbooker.model.Dissertation
import sn.android.workbooker.ui.DissertationActivity


class FrancaisFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_francais, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dr = Dissertation("test dkm")
        var dissertations: ArrayList<Dissertation> = ArrayList()
        for (i in 1..4) {
            dissertations.add(dr)
        }

        recview_sujet_fr.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = DissertationAdapter(context, dissertations)
        }

        floatingActionButtonfr.setOnClickListener {
            val intent = Intent(activity, DissertationActivity::class.java)
            startActivity(intent)
        }
    }
}