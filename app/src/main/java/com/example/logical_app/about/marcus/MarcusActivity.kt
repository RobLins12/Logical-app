package com.example.logical_app.about.marcus

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.logical_app.R

class MarcusActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marcus)

        val card1 = findViewById<CardView>(R.id.card_1)
        card1.setOnClickListener{
            val github = "https://github.com/MarcusMendes81"
            abrirUrl(github)
        }
        val card2 = findViewById<CardView>(R.id.card_2)
        card2.setOnClickListener{
            val web_mobile = "https://github.com/MarcusMendes81/portifolio.git"
            abrirUrl(web_mobile)
        }
        val card3 = findViewById<CardView>(R.id.card_3)
        card3.setOnClickListener{
           val linkedin = "https://www.linkedin.com/in/marcus-vin%C3%ADcius-mendes-68b3b218a/"
            abrirUrl(linkedin)
        }
    }
    private fun abrirUrl (url: String){
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}