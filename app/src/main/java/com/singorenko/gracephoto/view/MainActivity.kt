package com.singorenko.gracephoto.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.singorenko.gracephoto.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment()
    }

    fun initFragment(){
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_camera,
                CameraFragment.newInstance("", ""))
                .commit()

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_images,
                CarouselFragment.newInstance())
            .commit()
    }
}
