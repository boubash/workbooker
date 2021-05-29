package sn.android.workbooker.adapter

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Commentaire
import sn.android.workbooker.ui.MethodologieCommentaireActivity

class CommentaireViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val texte: TextView = itemView.findViewById(R.id.textCommentaire)
    private val niveau: TextView = itemView.findViewById(R.id.cibleTxt)
    private val commencer: TextView = itemView.findViewById(R.id.commencer_comment)

    fun bindCommentaire(commentaire: Commentaire, context: Context){
        texte.text = commentaire.texte
        niveau.text = commentaire.niveau_id.toString()
        commencer.setOnClickListener{
            val intent = Intent(context, MethodologieCommentaireActivity::class.java)
            context.startActivity(intent)
        }
    }

}