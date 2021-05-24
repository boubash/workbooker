package sn.android.workbooker.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.*
import sn.android.workbooker.R
import sn.android.workbooker.model.Dissertation

class DissertationAdapter(var context: Context , var dissertations: ArrayList<Dissertation>) : Adapter<DissertationViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DissertationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_dissertation, parent, false)
        return DissertationViewHolder(view)
    }

    override fun onBindViewHolder(holder: DissertationViewHolder, position: Int) {
        val dissertation: Dissertation = dissertations[position]
        holder.bindDissertation(dissertation)

    }

    override fun getItemCount(): Int {
        return dissertations.size
    }
}