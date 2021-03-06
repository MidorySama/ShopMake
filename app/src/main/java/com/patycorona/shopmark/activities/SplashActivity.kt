package com.patycorona.shopmark.activities

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.patycorona.shopmark.R
import com.patycorona.shopmark.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_ShopMark)
        super.onCreate(savedInstanceState)

        this.supportActionBar?.let {
            it.hide()
        }
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startLottieAnimation()
    }

    private fun startLottieAnimation() {

        binding.animationStartLottie.addAnimatorListener(object :Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                startActivity()
            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationRepeat(animation: Animator?) {

            }
        })

        binding.animationStartLottie.playAnimation()
    }

    fun startActivity() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}




