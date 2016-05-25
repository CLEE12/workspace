package com.ch.a0602touchlistener1;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnTouchListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView mv = new MyView(this);
        setContentView(mv);
        mv.setOnTouchListener(this);
    }
    class MyView extends View {
        MyView(Context context) { super(context); }
    }
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(getApplicationContext(),"대박이야",
                Toast.LENGTH_SHORT).show();
        return false;
    }
}