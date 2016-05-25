package com.ch.a0610longclick;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv; int count; Button incr, decr;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
        incr = (Button)findViewById(R.id.incr);
        decr = (Button)findViewById(R.id.desc);
        incr.setOnLongClickListener(listener);
        decr.setOnLongClickListener(listener);
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.incr : count++; tv.setText("숫자 : "+count); break;
            case R.id.desc : count--; tv.setText("숫자 : "+count);
        }
    }
    View.OnLongClickListener listener=new View.OnLongClickListener() {
        public boolean onLongClick(View v) {
            switch (v.getId()) {
                case R.id.incr : count = 10; tv.setText("숫자 : "+count); break;
                case R.id.desc : count = 100; tv.setText("숫자 : "+count);
            }
            return true;
        }
    };
}