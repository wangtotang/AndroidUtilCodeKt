package com.martintong.androidutilcodekt

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.martintong.kotlindemo.app.SimplePreference
import com.martintong.utilcode.util.isActivityExist
import com.martintong.utilcode.util.toast

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */
class HelloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)
        toast("" + isActivityExist(packageName, packageName + ".HellActivity"))
        var hei: Int by SimplePreference(this)
        hei = 1
    }

}