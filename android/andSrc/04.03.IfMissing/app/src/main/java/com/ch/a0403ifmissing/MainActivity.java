package com.ch.a0403ifmissing;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv; Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        iv = (ImageView)findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                if (iv.getVisibility()==View.VISIBLE) {
                   iv.setVisibility(View.GONE);
                 //   iv.setVisibility(View.INVISIBLE);
                } else {
                    iv.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}