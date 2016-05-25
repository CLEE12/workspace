package com.ch.a0404framelayout1;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
    ImageView iv;
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView)findViewById(R.id.imageView);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (iv.getVisibility()==iv.VISIBLE) {
                    iv.setVisibility(iv.INVISIBLE);
                } else {
                    iv.setVisibility(iv.VISIBLE);
                }
            }
        });
    }
}