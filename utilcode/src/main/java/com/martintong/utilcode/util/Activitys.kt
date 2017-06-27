@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.util

import android.app.Activity
import android.content.Intent

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */

/**
 * Launch a new activity.
 * @param clazz the new activity
 * @param isFinish true if the launcher activity is finished
 */
fun <T : Activity> Activity.startActivity(clazz: Class<T>, isFinish: Boolean = false) {
    startActivity(Intent(this, clazz))
    if (isFinish) {
        finish()
    }
}

/**
 * Launch an activity for which you would like a result when it finished.
 * @param clazz the new activity
 * @param requestCode
 */
inline fun <T : Activity> Activity.startActivityForResult(clazz: Class<T>, requestCode: Int) {
    startActivityForResult(Intent(this, clazz), requestCode)
}