package com.ch.a0607fruit1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    Button apple, banana; TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apple = (Button)findViewById(R.id.apple);
        banana  = (Button)findViewById(R.id.banana);
        tv = (TextView)findViewById(R.id.textView);
        apple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("사과는 맛있어");
            }
        });
        banana.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tv.setText("바나나는 길어");
            }
        });
    }
}