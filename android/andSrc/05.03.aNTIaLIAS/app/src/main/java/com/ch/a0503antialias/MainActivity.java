package com.ch.a0503antialias;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    class MyView extends View {
        MyView(Context context) {       super(context);        }
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setTextSize(50);
            paint.setColor(Color.BLACK);
            canvas.drawOval(new RectF(10,10,300,360),paint);
            canvas.drawText("대박사건", 510,340,paint);
            paint.setAntiAlias(true);
            canvas.drawOval(new RectF(10,380,700,730),paint);
            canvas.drawText("대박사건", 710,710,paint);
        }
    }
}