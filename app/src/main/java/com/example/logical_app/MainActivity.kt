package com.example.logical_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    val extra = "Oi"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun entrar(view : View){
        val name = findViewById<EditText>(R.id.name)
        val msg = name.text.toString()
        val intent = Intent(this, HomeActivity::class.java).apply {
            putExtra(extra, msg)
        }
        startActivity(intent)
    }
}