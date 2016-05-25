package com.ch.a0301javabutton;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn = new Button(this);
        btn.setText("대박");
        btn.setTextColor(Color.RED);
        btn.setTextSize(30);
        setContentView(btn);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                btn.setTextColor(Color.BLUE);
                btn.setText("에이 무슨 대박이야");
            }
        });
    }
}