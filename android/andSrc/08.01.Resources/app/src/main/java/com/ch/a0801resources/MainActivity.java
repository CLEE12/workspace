package com.ch.a0801resources;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.text);
        Resources res = getResources();
        int color = ContextCompat.getColor(getApplicationContext(), R.color.colorAccent);
                // res.getColor(R.color.colorAccent);
        String str = res.getString(R.string.test);
        float size = res.getDimension(R.dimen.size);
        tv.setText(str);
        tv.setTextColor(color);
        tv.setTextSize(size);
    }
}
