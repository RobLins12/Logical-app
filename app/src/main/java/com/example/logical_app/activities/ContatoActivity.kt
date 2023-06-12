package com.example.logical_app.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.logical_app.R
import com.example.logical_app.about.robson.RobsonActivity
import com.example.logical_app.about.talita.TalitaActivity

class ContatoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)
    }

    fun goRobson(view: View) {
        val intent = Intent(this, RobsonActivity::class.java)
        startActivity(intent)
    }

    fun goTalita(view: View) {
        val intentTalita = Intent(this, TalitaActivity::class.java)
        startActivity(intentTalita)
    }
    fun goMarcus(view: View) {}
}