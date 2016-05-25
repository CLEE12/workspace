package com.ch.a0611countdown;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv; int cnt = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.cnt);
        new CountDownTimer(11*1000,1000) {
            public void onTick(long millisUntilFinished) {
                cnt++;
                if (cnt==10) tv.setText("발사");
                else tv.setText("남은시간 : "+(10-cnt));
            }
            public void onFinish() {        }
        }.start();
    }
}
