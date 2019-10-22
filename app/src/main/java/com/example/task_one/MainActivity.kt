package com.example.task_one

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun loginBtnClicked(view: View){

        val loginIntent= Intent(this,Main2Activity::class.java)
        startActivity(loginIntent)




    }
}
