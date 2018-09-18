package com.apps.quixom.arshaps.utility

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.drawable.Drawable

class PointerDrawable: Drawable() {
    private val paint: Paint = Paint()
    private var enabled: Boolean = true

    public fun isEnabled(): Boolean {
        return enabled
    }

    public fun setEnabled(state: Boolean): Unit {
        enabled = state
    }

    override fun draw(canvas: Canvas) {
        val cx: Float = canvas.width.div(2).toFloat()
        val cy: Float = canvas.height.div(2).toFloat()
        if (enabled) {
            paint.color = Color.GREEN
            canvas.drawCircle(cx, cy, 100f, paint)
        } else {
            paint.color = Color.GRAY
            canvas.drawCircle(cx, cy, 100f, paint)
        }
    }

    override fun setAlpha(alpha: Int) {


    }

    override fun getOpacity(): Int {
        return opacity.plus(1)
    }

    override fun setColorFilter(colorFilter: ColorFilter?) {

    }
}