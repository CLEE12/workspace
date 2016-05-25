package com.ch.a0509vibrate;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Vibrator vib;
    Button one, repeat, stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vib = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        one = (Button)findViewById(R.id.button);
        repeat = (Button)findViewById(R.id.button2);
        stop = (Button)findViewById(R.id.button3);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vib.vibrate(500);}});
        repeat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vib.vibrate(new long[] {500, 200, 100, 50}, 0 );}});
        stop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vib.cancel();}});
    }
    protected void onDestroy() {
        super.onDestroy();
        vib.cancel();
    }
}
