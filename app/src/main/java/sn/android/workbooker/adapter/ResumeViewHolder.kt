package sn.android.workbooker.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Resume

class ResumeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var texte: TextView = itemView.findViewById(R.id.textResumer)
    private var cible: TextView = itemView.findViewById(R.id.cibleTxt)

    fun bindResume(resume: Resume){
        texte.text = resume.texte
        cible.text = resume.cible
    }
}