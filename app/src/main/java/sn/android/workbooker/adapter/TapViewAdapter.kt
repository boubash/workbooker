package sn.android.workbooker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R

@Suppress("UNREACHABLE_CODE")
class TapViewAdapter : RecyclerView.Adapter<TapViewAdapter.EventViewHolder>() {
    val dissertationList = listOf("Dissertation", "Commentaire", "Résumé")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        EventViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.raw_accueil, parent, false))

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        (holder.view as? TextView)?.also {
            it.text = (dissertationList.get(position))
        }
    }

    override fun getItemCount(): Int {
        return dissertationList.count()
    }
        class EventViewHolder(val view: View) : RecyclerView.ViewHolder(view)


}
