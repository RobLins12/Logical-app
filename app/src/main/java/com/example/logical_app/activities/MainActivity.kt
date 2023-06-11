package com.example.logical_app.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.logical_app.R

class MainActivity : AppCompatActivity() {

    val extra = "Oi"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun entrar(view : View){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}