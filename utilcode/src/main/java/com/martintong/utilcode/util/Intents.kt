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
 * @param activity the launcher activity
 */
fun Intent.startActivity(activity: Activity) {
    activity.startActivity(this)
}

/**
 * Launch an activity for which you would like a result when it finished.
 * @param clazz the new activity
 * @param requestCode
 */
fun <T : Activity> Intent.startActivityForResult(activity: Activity, requestCode: Int) {
    activity.startActivityForResult(this, requestCode)
}