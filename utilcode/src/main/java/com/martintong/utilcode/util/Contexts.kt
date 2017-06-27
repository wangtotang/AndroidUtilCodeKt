@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */

/**
 * Returns true if the [Activity] is existent
 * @param packageName
 * @param className (Note:fully qualified class name)
 * @return
 */
inline fun Context.isActivityExist(packageName: String, className: String): Boolean =
        packageManager.resolveActivity(Intent().setClassName(packageName, className), 0) != null

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
inline fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
inline fun Context.toast(message: Int) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Context.longToast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Context.longToast(message: Int) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()


