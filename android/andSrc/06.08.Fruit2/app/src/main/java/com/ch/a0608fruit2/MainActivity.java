package com.ch.a0608fruit2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button apple, banana;  TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apple = (Button)findViewById(R.id.apple);
        banana  = (Button)findViewById(R.id.banana);
        tv = (TextView)findViewById(R.id.textView);
        apple.setOnClickListener(listener);
        banana.setOnClickListener(listener);
    }
    View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.apple : tv.setText("사과먹니 ?"); break;
                case R.id.banana: tv.setText("바나나 맛있니 ?");
            }
        }
    };
}