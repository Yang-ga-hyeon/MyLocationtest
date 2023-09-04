package com.example.mylocation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goLogin()
    }
    fun goLogin() {
        val button = findViewById<Button>(R.id.btnGo)
        button.setOnClickListener{
            //로그인 화면으로 이동
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
        }
    }
}