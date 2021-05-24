package sn.android.workbooker.type_de_sujet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_resume.*
import sn.android.workbooker.R
import sn.android.workbooker.adapter.ResumeAdapter
import sn.android.workbooker.model.Resume

class ResumeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_resume, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resume = Resume()
        resume.texte = "dvkjg wdiwdg i widngoingw oijidv ofjifgd okwidv iniowr grwoirgw okwrnjv" +
                "jnjgnjefnbjofenbiofefbkj vkjfb "
        resume.cible = "terminale"
        val resumes: ArrayList<Resume> = ArrayList()
        for (i in 1..7) {
            resumes.add(resume)
        }

        recview_resume.apply{
            layoutManager = LinearLayoutManager(activity)
            adapter = ResumeAdapter(context, resumes)
        }
    }

}