package sn.android.workbooker.adapter

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Dissertation
import sn.android.workbooker.ui.MethodologieDissertationActivity

class DissertationViewHolder(itemView: View ) : RecyclerView.ViewHolder(itemView) {
    private val mTitle: TextView = itemView.findViewById(R.id.textSujet);
    private val mCommencer: TextView = itemView.findViewById(R.id.commencer_dissert);

    fun bindDissertation(dissertation: Dissertation, context: Context){
        mTitle.text = dissertation.titre
        mCommencer.setOnClickListener{
            val intent = Intent(context, MethodologieDissertationActivity::class.java)
            context.startActivity(intent)
        }
    }
}
