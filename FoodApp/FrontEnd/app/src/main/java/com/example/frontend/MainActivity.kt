package com.example.frontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)


    }

    fun  openMain2(view: View){
        val intent = Intent(this,MainActivity2::class.java).apply {

        }
        startActivity(intent);
    }
}