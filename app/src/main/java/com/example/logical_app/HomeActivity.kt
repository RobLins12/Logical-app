package com.example.logical_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.logical_app.robson.RobsonActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }

    fun goStudy(view : View){
        val intent = Intent(this, StudyActivity::class.java)
        startActivity(intent)
    }
    fun goContato(view : View){
        val intent = Intent(this, RobsonActivity::class.java)
        startActivity(intent)
    }
    fun goQuiz(view : View){
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    }
}