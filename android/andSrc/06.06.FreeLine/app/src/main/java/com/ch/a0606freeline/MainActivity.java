package com.ch.a0606freeline;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Vertex> al;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
        al = new ArrayList<>();
    }
    class MyView extends View {
        Paint paint;
        MyView(Context context) {
            super(context); paint = new Paint();  paint.setAntiAlias(true);
            paint.setColor(Color.BLACK);  paint.setStrokeWidth(3);
        }
        protected void onDraw(Canvas canvas) {
            for (int i =0; i < al.size();i++) {
                if (al.get(i).draw) {
                    canvas.drawLine(al.get(i-1).x,al.get(i-1).y,
                            al.get(i).x,al.get(i).y,paint);
                }
            }
        }
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN :
                    al.add(new Vertex(event.getX(),event.getY(),false));
                    return true;
                case MotionEvent.ACTION_MOVE :
                    al.add(new Vertex(event.getX(),event.getY(),true));
                    invalidate();
                    return true;
            }
            return false;
        }
    }
    class Vertex {
        float x, y;  boolean draw;
        Vertex(float x, float y, boolean draw) {
            this.x = x; this.y = y; this.draw = draw;
        }
    }
}