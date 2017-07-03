@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.util

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment as Fragmentv4

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
fun <T : Activity> Activity.startActivityForResult(clazz: Class<T>, requestCode: Int) {
    startActivityForResult(Intent(this, clazz), requestCode)
}

/**
 * Launch a new activity.
 * @param clazz the new activity
 */
fun <T : Activity> Fragment.startActivity(clazz: Class<T>) {
    startActivity(Intent(activity, clazz))
}

/**
 * Launch a new activity.
 * @param clazz the new activity
 */
fun <T : Activity> Fragmentv4.startActivity(clazz: Class<T>) {
    startActivity(Intent(activity, clazz))
}

/**
 * Returns true if the [Activity] is existent
 * @param packageName
 * @param className (Note:fully qualified class name)
 * @return
 */
fun Context.isActivityExist(packageName: String, className: String): Boolean =
        packageManager.resolveActivity(Intent().setClassName(packageName, className), 0) != null