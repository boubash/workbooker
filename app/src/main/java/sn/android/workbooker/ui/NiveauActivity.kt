package sn.android.workbooker.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_niveau.*
import sn.android.workbooker.R

class NiveauActivity : AppCompatActivity() {
    private var niveau: String = ""
    var radioGroup: RadioGroup? = null
    lateinit var radioButton: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveau)

        supportActionBar?.hide()

        radioGroup = findViewById(R.id.radioGroupNiveau)


        valider_niveau.setOnClickListener{
            val niveauId: Int = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(niveauId)
            val intent = Intent(this, MatiereActivity::class.java)
            intent.putExtra("niveau", radioButton.text)
            startActivity(intent)
        }
    }

}