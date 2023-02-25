package com.example.androidmvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /**
     * Declare views to initialize later
     */
    lateinit var btnLike: Button
    lateinit var btnDisLike: Button
    lateinit var btnExit: Button

    lateinit var tvLike: TextView
    lateinit var tvDisLike: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * calls to initiate views
         */
        initViews()

        var likeCount = 0
        var disLikeCount = 0

        btnLike.setOnClickListener {
            likeCount++
            tvLike.text = likeCount.toString()
        }

        btnDisLike.setOnClickListener {
            disLikeCount++
            tvDisLike.text = disLikeCount.toString()
        }

        btnExit.setOnClickListener {
            finish();
        }
    }

    /**
     * Initialize the views
     */
    private fun initViews(){
        btnLike = findViewById(R.id.buttonLike)
        btnDisLike = findViewById(R.id.buttonDisLike)
        btnExit = findViewById(R.id.buttonExit)

        tvLike = findViewById(R.id.tvLike)
        tvDisLike = findViewById(R.id.tvDisLike)
    }
}