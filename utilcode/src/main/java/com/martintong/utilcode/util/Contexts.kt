@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.util

import android.content.Context
import android.os.Handler
import android.os.Looper

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */

/**
 * Execute [f] on the application UI thread.
 */
fun Context.runOnUiThread(f: Context.() -> Unit) {
    if (Looper.getMainLooper().thread == Thread.currentThread()) f()
    else Handler(Looper.getMainLooper()).post { f() }
}




