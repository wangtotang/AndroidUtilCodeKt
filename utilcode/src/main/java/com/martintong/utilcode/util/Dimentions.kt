@file:Suppress("NOTHING_TO_INLINE", "unused")
package com.martintong.utilcode.util

import android.content.Context

/**
🐶 @author  Martin_Tong
🐶 @date    2017/7/3
🐶
🐶 @apiNote
 */

/**
 * returns dp dimension value in pixels
 * @param value
 */
fun Context.dp(value: Int): Int = (value * resources.displayMetrics.density).toInt()

/**
 * returns dp dimension value in pixels
 * @param value
 */
fun Context.dp(value: Float): Int = (value * resources.displayMetrics.density).toInt()

/**
 * return sp dimension value in pixels
 * @param value
 */
fun Context.sp(value: Int): Int = (value * resources.displayMetrics.scaledDensity).toInt()

/**
 * return sp dimension value in pixels
 * @param value
 */
fun Context.sp(value: Float): Int = (value * resources.displayMetrics.scaledDensity).toInt()

/**
 * converts px value into dp
 * @param px
 */
fun Context.px2dp(px: Float): Float = px / resources.displayMetrics.density

/**
 * converts px value into sp
 * @param px
 */
fun Context.px2sp(px: Float): Float = px / resources.displayMetrics.scaledDensity