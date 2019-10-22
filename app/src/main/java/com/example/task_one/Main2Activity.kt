package com.example.task_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    fun singupBtnClicked(view: View){



        val singin= Intent(this,Main3Activity::class.java)
        startActivity(singin)



    }
}
