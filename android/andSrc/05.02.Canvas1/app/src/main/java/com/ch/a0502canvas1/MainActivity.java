package com.ch.a0502canvas1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    class MyView extends View {
        MyView(Context context) {    super(context);       }
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(Color.BLACK);
            canvas.drawLine(10,10,20,500,paint);
            paint.setColor(Color.RED);
            canvas.drawCircle(150,150,100,paint);
            paint.setColor(Color.BLUE);
            canvas.drawRect(100,500,400,700,paint);
            paint.setColor(Color.GREEN);
            canvas.drawText("금요일이야, 열공해야지",50,300,paint);
        }
    }
}