@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.util

import android.app.Fragment
import android.content.Context
import android.widget.Toast
import android.support.v4.app.Fragment as Fragmentv4

/**
🐶 @author  Martin_Tong
🐶 @date    2017/7/3
🐶
🐶 @apiNote Display the toast message
 */

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

/**
 * Display the [Toast] message with the [Toast.LENGTH_SHORT] duration.
 * @param message
 */
fun Context.toast(message: Int) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
fun Context.longToast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

/**
 * Display the [Toast] message with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
fun Context.longToast(message: Int) = Toast.makeText(this, message, Toast.LENGTH_LONG).show()

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
 * Display the [Toast] message safely with the [Toast.LENGTH_LONG] duration.
 * @param message
 */
inline fun Context.toastSafely(message: CharSequence){
    runOnUiThread { toast(message) }
}
