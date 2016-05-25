package com.ch.a0507toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4,btn5;
    int count; String msg; Toast toast;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.button4);
        btn5 = (Button)findViewById(R.id.button5);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"짧은 메세지",
                        Toast.LENGTH_SHORT).show();         }      });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"긴 메세지",
                        Toast.LENGTH_LONG).show();         }      });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                msg = "현재 : " + count++;
                if (toast !=null) toast.cancel();
                toast = Toast.makeText(getApplicationContext(),msg,
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                msg = "현재 : " + count++;
                if (toast !=null) toast.setText(msg);
                else {
                    toast = Toast.makeText(getApplicationContext(),msg,
                            Toast.LENGTH_SHORT);
                }
                toast.show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LinearLayout linear = (LinearLayout)View
                        .inflate(getApplicationContext(),R.layout.toastview,null);
                Toast t2 = new Toast(getApplicationContext());
                t2.setView(linear);
                t2.show();
            }
        });
    }
}