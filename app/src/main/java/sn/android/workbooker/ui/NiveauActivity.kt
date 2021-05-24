package sn.android.workbooker.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_niveau.*
import sn.android.workbooker.R

class NiveauActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau)

        supportActionBar?.hide()

        valider_niveau.setOnClickListener{
            val intent = Intent(this, MatiereActivity::class.java)
            startActivity(intent)
        }

    }
}