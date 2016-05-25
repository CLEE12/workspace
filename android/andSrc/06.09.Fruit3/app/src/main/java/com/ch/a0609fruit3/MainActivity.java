package com.ch.a0609fruit3;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.textView);
    }
    public void mOnClick(View v) {
        switch (v.getId()) {
            case R.id.apple : tv.setText("사과 ? ");  break;
            case R.id.banana: tv.setText("바나나 길어");
        }
    }
}