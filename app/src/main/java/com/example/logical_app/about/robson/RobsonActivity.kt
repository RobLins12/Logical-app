package com.example.logical_app.about.robson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import com.example.logical_app.R

class RobsonActivity : AppCompatActivity() {
    var sobreCont = 0;
    var curioCont = 0;
    var hobbieCont = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_robson)

        sobreCont = 1
        curioCont = 1
        hobbieCont = 1
    }

    fun sobreMim(view: View) {
        if (sobreCont == 1){
            AlertDialog.Builder(this).setMessage("Sou Estudante da Unicap").show();
        }
        if (sobreCont == 2){
            AlertDialog.Builder(this).setMessage("Faço estágio na area de robotica maker").show();
        }
        if (sobreCont == 3){
            AlertDialog.Builder(this).setMessage("Faço PIBIC com o prof. Sérgio Murilo").show();
        }
        if (sobreCont == 2){
            sobreCont = 1
            return
        }
        sobreCont++
    }

    fun curiosidades(view: View) {
        if (curioCont == 1){
            AlertDialog.Builder(this).setMessage("Tenho 4,75 de mioia").show();
        }
        if (curioCont == 2){
            AlertDialog.Builder(this).setMessage("Sou filho de professor da UNICAP").show();
        }
        if (curioCont == 2){
            curioCont = 1
            return
        }
        curioCont++
    }
    fun hobbies(view: View) {
        if (hobbieCont == 1){
            AlertDialog.Builder(this).setMessage("Jogar Videogame").show();
        }
        if (hobbieCont == 2){
            AlertDialog.Builder(this).setMessage("Dançar").show();
        }
        if (hobbieCont == 3){
            AlertDialog.Builder(this).setMessage("RPG").show();
        }
        if (hobbieCont == 3){
            hobbieCont = 1
            return
        }
        hobbieCont++
    }
}