package com.gsixacademy.android.myshoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {

    private lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        // TODO Step 4 - for Shake Animation !!!
        // init views
        image = findViewById(R.id.imageView)

        // TODO Step 2 - for Shake Animation !!!
        animateShopping()


        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        },1000)
    }
    // TODO Step 3 - for Shake Animation !!!
    private fun animateShopping() {
        val shake = AnimationUtils.loadAnimation(this, R.anim.shake_animation)
        image.animation = shake
    }
}