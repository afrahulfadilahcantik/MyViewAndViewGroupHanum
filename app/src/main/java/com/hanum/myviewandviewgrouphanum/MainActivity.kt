package com.hanum.myviewandviewgrouphanum

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.hanum.myviewandviewgrouphanum.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Google Pixel"
    }
}