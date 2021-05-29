package sn.android.workbooker.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sn.android.workbooker.R
import sn.android.workbooker.model.Commentaire

class CommentaireAdapter(var context: Context, var commentaires: ArrayList<Commentaire>) : RecyclerView.Adapter<CommentaireViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommentaireViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_commentaire, parent, false)
        return CommentaireViewHolder(view)
    }

    override fun onBindViewHolder(holder: CommentaireViewHolder, position: Int) {
        val commentaire: Commentaire = commentaires[position]
        holder.bindCommentaire(commentaire, context)
    }

    override fun getItemCount(): Int {
        return commentaires.size
    }
}