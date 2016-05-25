package com.ch.a0410orientaionchange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linear;  Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear = (LinearLayout)findViewById(R.id.linear);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (linear.getOrientation()==LinearLayout.VERTICAL)
                     linear.setOrientation(LinearLayout.HORIZONTAL);
                else linear.setOrientation(LinearLayout.VERTICAL);
            }
        });
    }
}