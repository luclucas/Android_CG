package com.lulu.estudo_canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class MyView(context: Context): View(context) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)

    init {
        paint.apply {color = Color.BLUE ; style = Paint.Style.STROKE; strokeWidth = 5F }

    }


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawRect(10F, 20F, 200F, 200F, paint)

    }


}