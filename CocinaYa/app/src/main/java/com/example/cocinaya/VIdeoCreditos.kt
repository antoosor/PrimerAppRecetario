package com.example.cocinaya

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.VideoView

class VIdeoCreditos : AppCompatActivity() {

    var videoView: VideoView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_v_ideo_creditos)
        videoView = findViewById<View>(R.id.videoView) as VideoView
        val path ="android.resource://" + packageName + "/" + R.raw.creditoscocinaya
        videoView!!.setVideoURI(Uri.parse(path))
        videoView!!.start()
    }
}
