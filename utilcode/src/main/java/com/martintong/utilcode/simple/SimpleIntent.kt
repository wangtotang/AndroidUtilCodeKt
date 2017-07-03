@file:Suppress("NOTHING_TO_INLINE", "unused")

package com.martintong.utilcode.simple

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import java.io.Serializable

/**
🐶 @author  Martin_Tong
🐶 @date    2017/6/27
🐶
🐶 @apiNote
 */

/**
 * A simple [Intent] class ,it can provide chain programming
 */
class SimpleIntent<T : Activity>(val activity: Activity, cls: Class<T>) : Intent(activity, cls) {

    /**
     * Add some extended data to the [Intent].
     */
    fun putExtras(vararg params: Pair<String, Any>): SimpleIntent<T> {
        if (params.isNotEmpty()) {
            for ((k, v) in params) {
                when (v) {
                    null -> super.putExtra(k, null as Serializable?)
                    is Int -> super.putExtra(k, v)
                    is Long -> super.putExtra(k, v)
                    is CharSequence -> super.putExtra(k, v)
                    is String -> super.putExtra(k, v)
                    is Float -> super.putExtra(k, v)
                    is Double -> super.putExtra(k, v)
                    is Char -> super.putExtra(k, v)
                    is Short -> super.putExtra(k, v)
                    is Boolean -> super.putExtra(k, v)
                    is Serializable -> super.putExtra(k, v)
                    is Bundle -> super.putExtra(k, v)
                    is Parcelable -> super.putExtra(k, v)
                    is Array<*> -> when {
                        v.isArrayOf<CharSequence>() -> super.putExtra(k, v)
                        v.isArrayOf<String>() -> super.putExtra(k, v)
                        v.isArrayOf<Parcelable>() -> super.putExtra(k, v)
                        else -> throw IllegalArgumentException("Intent extra $k has wrong type ${v.javaClass.name}")
                    }
                    is IntArray -> super.putExtra(k, v)
                    is LongArray -> super.putExtra(k, v)
                    is FloatArray -> super.putExtra(k, v)
                    is DoubleArray -> super.putExtra(k, v)
                    is CharArray -> super.putExtra(k, v)
                    is ShortArray -> super.putExtra(k, v)
                    is BooleanArray -> super.putExtra(k, v)
                    else -> throw IllegalArgumentException("Intent extra $k has wrong type ${v.javaClass.name}")
                }
            }
        }
        return this
    }

    override fun putExtra(name: String, v: Int): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Long): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: CharSequence): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: String): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Float): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Double): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Char): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Short): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Boolean): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Serializable): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Bundle): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Parcelable): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: IntArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: LongArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: FloatArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: DoubleArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: CharArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: ShortArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: BooleanArray): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Array<CharSequence>): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Array<String>): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    override fun putExtra(name: String, v: Array<Parcelable>): SimpleIntent<T> {
        super.putExtra(name, v)
        return this
    }

    /**
     * Launch a new activity.
     */
    fun startActivity() {
        activity.startActivity(this)
    }

    /**
     * Launch a new activity.
     * @param requestCode
     */
    fun startActivityForResult(requestCode: Int) {
        activity.startActivityForResult(this, requestCode)
    }
}