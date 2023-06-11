package com.example.logical_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.logical_app.robson.RobsonActivity

class ContatoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contato)
    }

    fun goRobson(view: View) {
        val intent = Intent(this, RobsonActivity::class.java)
        startActivity(intent)
    }

    fun goTalita(view: View) {}
    fun goMarcus(view: View) {}
}