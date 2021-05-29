package sn.android.workbooker.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Resume

class ResumeAdapter(var context: Context, var resumes: ArrayList<Resume>) : RecyclerView.Adapter<ResumeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResumeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_resume, parent, false)
        return ResumeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResumeViewHolder, position: Int) {
        val resume: Resume = resumes[position]
        holder.bindResume(resume)

    }

    override fun getItemCount(): Int {
        return resumes.size
    }
}