package com.ch.a0504bitmap1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    class MyView extends View {
        MyView(Context context) {    super(context);    }
        protected void onDraw(Canvas canvas) {
            Bitmap bm = BitmapFactory.decodeResource(getResources(),
                    R.drawable.harubang);
            canvas.drawBitmap(bm,10,10,null);
            canvas.drawBitmap(bm, null,
                    new Rect(220,210,470,385), null);
            canvas.drawBitmap(bm, new Rect(30,30,70,80),
                    new Rect(680,610,680+80,610+100), null);
        }
    }
}