package com.ch.a0508customfont;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    Typeface font;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
        font = Typeface.createFromAsset(getAssets(),"balloons.ttf");
    }
    class MyView extends View {
        MyView(Context context){ super(context); }
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint(); paint.setAntiAlias(true);
            paint.setTypeface(font);
            paint.setTextSize(40);
            canvas.drawText("Custom Font",50,50,paint);
        }
    }
}