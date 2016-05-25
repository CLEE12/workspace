package com.ch.a0605touchlistener4;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (LinearLayout)findViewById(R.id.linear);
        linear.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                Toast.makeText(getApplicationContext(),"허걱 ~~",
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}