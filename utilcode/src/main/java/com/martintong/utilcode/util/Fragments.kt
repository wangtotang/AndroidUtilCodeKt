@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.util

import android.app.Activity
import android.app.Fragment
import android.content.Intent
import android.widget.Toast
import android.support.v4.app.Fragment as Fragmentv4

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
inline fun Fragment.toast(message: CharSequence) = activity.toast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
inline fun Fragment.toast(message: Int) = activity.toast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Fragment.longToast(message: CharSequence) = activity.longToast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Fragment.longToast(message: Int) = activity.longToast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
inline fun Fragmentv4.toast(message: CharSequence) = activity.toast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
inline fun Fragmentv4.toast(message: Int) = activity.toast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Fragmentv4.longToast(message: CharSequence) = activity.longToast(message)

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Fragmentv4.longToast(message: Int) = activity.longToast(message)

/**
 * Launch a new activity.
 * @param clazz the new activity
 */
inline fun <T : Activity> Fragment.startActivity(clazz: Class<T>) {
    startActivity(Intent(activity, clazz))
}

/**
 * Launch a new activity.
 * @param clazz the new activity
 */
inline fun <T : Activity> Fragmentv4.startActivity(clazz: Class<T>) {
    startActivity(Intent(activity, clazz))
}

