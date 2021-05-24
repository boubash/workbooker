package sn.android.workbooker.type_de_sujet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_commentaire.*
import sn.android.workbooker.R
import sn.android.workbooker.adapter.CommentaireAdapter
import sn.android.workbooker.model.Commentaire

class CommentaireFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_commentaire, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val com = Commentaire()
        com.texte = "dgjdiojgifnogvno slkmdgoifg sdgnoifsd dfknoifds dinodg sdoijsdg "

        var commentaires: ArrayList<Commentaire> = ArrayList()
        commentaires.add(com)

        recview_commnentaire.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = CommentaireAdapter(context, commentaires)
        }
    }
}