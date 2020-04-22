package com.example.ktdraw

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class MyDraw1: View {

    constructor(context: Context): super(context){

    }

    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet){

    }

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int): super(context, attributeSet, defStyleAttr){

    }
   private val paint: Paint = Paint()
   private val most = 66
   private val least = 100 - most
   private val dark = 10
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        //画圆
        paint.strokeWidth = 50f
        paint.color = resources.getColor(R.color.MycircleGray)
        paint.style = Paint.Style.STROKE
        //画涂的区域
        canvas.drawCircle(500f, 500f, 150f, paint)
        paint.color = resources.getColor(R.color.MycircleGreen)
        paint.strokeCap = Paint.Cap.ROUND
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawArc(350f, 350f, 650f, 650f, -90f, most * 3.6f, false, paint)
            paint.color = resources.getColor(R.color.MycircleDarkGreen)
            canvas.drawArc(350f, 350f, 650f, 650f, -90f, dark * 3.6f, false, paint)
        }
        //写字
        paint.reset()
        paint.textSize = 90f
        paint.isFakeBoldText = true
        paint.color = resources.getColor(R.color.MyBlack)
        canvas.drawText("$most", 450f, 520f, paint)
        paint.textSize = 40f
        paint.color = resources.getColor(R.color.MyshallowBlack)
        canvas.drawText( "$least", 480f, 570f, paint)
    }
}