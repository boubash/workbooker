package sn.android.workbooker.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Dissertation

class DissertationViewHolder(itemView: View ) : RecyclerView.ViewHolder(itemView) {
    private val mTitle: TextView = itemView.findViewById(R.id.textSujet);

    fun bindDissertation(dissertation: Dissertation){
        mTitle.text = dissertation.titre
    }
}
