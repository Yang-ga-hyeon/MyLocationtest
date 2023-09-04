package com.example.mylocation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LocationDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_detail)

        val locationName = intent.getStringExtra("locationName")
        // locationName을 사용하여 해당 지역의 설명 페이지를 표시하도록 구현합니다.
    }
}