package com.martintong.androidutilcodekt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hello.*

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        tv_hello.text = intent.getStringExtra("S")
    }

}