package com.ch.a0703checkmenu;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onPrepareOptionsMenu(Menu menu) {
        if (btn.getTextSize()==80) {
            menu.findItem(R.id.bigfont).setChecked(true);
        } else menu.findItem(R.id.bigfont).setChecked(false);
        int color = btn.getTextColors().getDefaultColor();
        if (color==Color.RED)
            menu.findItem(R.id.red).setChecked(true);
        else if (color==Color.BLUE)
            menu.findItem(R.id.blue).setChecked(true);
        else menu.findItem(R.id.green).setChecked(true);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.bigfont :
                if (item.isChecked())
                    btn.setTextSize(TypedValue.COMPLEX_UNIT_PX,40);
                else btn.setTextSize(TypedValue.COMPLEX_UNIT_PX,80);
                break;
            case R.id.red : btn.setTextColor(Color.RED); break;
            case R.id.blue : btn.setTextColor(Color.BLUE); break;
            case R.id.green : btn.setTextColor(Color.GREEN); break;
        }
        return true;
    }
}