package com.example.ktdraw

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.os.Build
import android.util.AttributeSet
import android.view.View

class MyDraw2 : View {
    private val paint: Paint = Paint()
    private val textY = 600f
    private val textX = 100f
    private val textInterval = 140f
    private val rectYInterval = 100f

    constructor(context: Context): super(context){

    }

    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet){

    }

    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int): super(context, attributeSet, defStyleAttr){

    }

    override fun onDraw(canvas: Canvas) {
        //写字
        paint.textSize = 30f
        paint.color = resources.getColor(R.color.MytextGray)
        canvas.drawText("MON",textX,textY,paint)
        canvas.drawText("THE",textX+textInterval,textY,paint)
        canvas.drawText("WED",textX+2*textInterval,textY,paint)
        canvas.drawText("THU",textX+3*textInterval,textY,paint)
        canvas.drawText("FRI",textX+4*textInterval,textY,paint)
        canvas.drawText("SAR",textX+5*textInterval,textY,paint)
        canvas.drawText("SUN",textX+6*textInterval,textY,paint)
        //画圆角矩形
        paint.color = resources.getColor(R.color.MyBlue)
        paint.textSize = 40f
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            canvas.drawRoundRect(textX,textY-rectYInterval,textX+70,textY-60,10f,10f,paint)
            canvas.drawRoundRect(textX+textInterval,textY-2*rectYInterval,textX+70+textInterval*1,textY-60,10f,10f,paint)
            canvas.drawRoundRect(textX+2*textInterval,textY-3*rectYInterval,textX+70+textInterval*2,textY-60,10f,10f,paint)
            canvas.drawRoundRect(textX+3*textInterval,textY-4*rectYInterval,textX+70+textInterval*3,textY-60,10f,10f,paint)
            canvas.drawRoundRect(textX+4*textInterval,textY-5*rectYInterval,textX+70+textInterval*4,textY-60,10f,10f,paint)
            canvas.drawRoundRect(textX+5*textInterval,textY-3*rectYInterval,textX+70+textInterval*5,textY-60,10f,10f,paint)
            canvas.drawRoundRect(textX+6*textInterval,textY-2*rectYInterval,textX+70+textInterval*6,textY-60,10f,10f,paint)
        }
        //写字
        canvas.drawText("1",textX+25,textY-rectYInterval-20,paint)
        canvas.drawText("2",textX+25+1*textInterval,textY-2*rectYInterval-20,paint)
        canvas.drawText("3",textX+25+2*textInterval,textY-3*rectYInterval-20,paint)
        canvas.drawText("4",textX+25+3*textInterval,textY-4*rectYInterval-20,paint)
        canvas.drawText("5",textX+25+4*textInterval,textY-5*rectYInterval-20,paint)
        canvas.drawText("3",textX+25+5*textInterval,textY-3*rectYInterval-20,paint)
        canvas.drawText("2",textX+25+6*textInterval,textY-2*rectYInterval-20,paint)

    }
}