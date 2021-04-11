package br.com.edma.comprepequenojundiai.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.VideoView
import br.com.edma.comprepequenojundiai.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val videoPath = "android.resource://$packageName/raw/abertura"
        val video = findViewById<VideoView>(R.id.video);
        video.setVideoPath(videoPath)
        loadSplash()
        video.start()
        }

    private fun loadSplash(){
        Handler().postDelayed({
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        },5000)

    }
}