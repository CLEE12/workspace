package com.ch.a0409multipage;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3; View page1,page2,page3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        page1 = (View)findViewById(R.id.pag1);
        page2 = (View)findViewById(R.id.pag2);
        page3 = (View)findViewById(R.id.pag3);
        clear();       page1.setVisibility(View.VISIBLE);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clear();  page1.setVisibility(View.VISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clear();  page2.setVisibility(View.VISIBLE);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clear();  page3.setVisibility(View.VISIBLE);
            }
        });
    }
    public void clear() {
        page1.setVisibility(View.INVISIBLE);
        page2.setVisibility(View.INVISIBLE);
        page3.setVisibility(View.INVISIBLE);
    }
}