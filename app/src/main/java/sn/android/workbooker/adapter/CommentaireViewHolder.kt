package sn.android.workbooker.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Commentaire

class CommentaireViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val texte: TextView = itemView.findViewById(R.id.textCommentaire)
    private val niveau: TextView = itemView.findViewById(R.id.cibleTxt)

    fun bindCommentaire(commentaire: Commentaire){
        texte.text = commentaire.texte
        niveau.text = commentaire.niveau_id.toString()
    }

}