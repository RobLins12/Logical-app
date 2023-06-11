package com.example.logical_app.about.talita

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.logical_app.R

class TalitaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_talita)

        val instagramImageView = findViewById<ImageView>(R.id.lg_insta)
        instagramImageView.setOnClickListener{
            val profilePath = "https://www.instagram.com/talitapach/"
            val instaPackageName = "com.instagram.android"
            openUrl(profilePath, instaPackageName)
        }

        val linkedinImageView = findViewById<ImageView>(R.id.lg_linkedin)
        linkedinImageView.setOnClickListener{
            val profilePath = "https://www.linkedin.com/in/talita-pacheco-690216208/"
            val linkedinPackageName = "com.linkedin.android"
            openUrl(profilePath, linkedinPackageName)
        }

        val githubImageView = findViewById<ImageView>(R.id.lg_github)
        githubImageView.setOnClickListener{
            val profilePath = "https://github.com/Talitapach"
            val githubPackageName = "com.github.android"
            openUrl(profilePath, githubPackageName)
        }

    }

    private fun openUrl(profilePath: String, openAppPacketName: String){
        val uri = Uri.parse(profilePath)
        try{
            startActivity(Intent(Intent.ACTION_VIEW, uri).setPackage(openAppPacketName))
        } catch (e:Exception) {
            startActivity(Intent(Intent.ACTION_VIEW, uri))
        }
    }
}