package com.ch.a0601touchevent1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }
    class MyView extends View {
        MyView(Context context) { super(context); }
        public boolean onTouchEvent(MotionEvent event) {
            Toast.makeText(getApplicationContext(),"왜! 만져",
                    Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}