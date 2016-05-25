package com.ch.a0603touchlistener2;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView mv = new MyView(this);
        setContentView(mv);
        mv.setOnTouchListener(listener);
    }
    class MyView extends View {
        MyView(Context context) { super(context); }
    }
    View.OnTouchListener listener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            Toast.makeText(getApplicationContext(),"헐! 졸려 월요일",
                    Toast.LENGTH_SHORT).show();
            return false;
        }
    };
}