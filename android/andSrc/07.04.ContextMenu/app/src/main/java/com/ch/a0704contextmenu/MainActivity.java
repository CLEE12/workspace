package com.ch.a0704contextmenu;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn; EditText et; ImageView iv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.button);
        et = (EditText)findViewById(R.id.editText);
        iv = (ImageView)findViewById(R.id.imageView);
        registerForContextMenu(btn);
        registerForContextMenu(et);
        registerForContextMenu(iv);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        if (v==btn) {
            menu.setHeaderTitle("버튼메뉴").setHeaderIcon(R.drawable.koreanfood);
            menu.add(0,0,0,"빨강"); menu.add(0,1,0,"파랑"); menu.add(0,2,0,"초록");
        }
        if (v==et) {
            menu.setHeaderTitle("편집메뉴").setHeaderIcon(R.drawable.weather);
            menu.add(0,3,0,"복사하기"); menu.add(0,4,0,"잘라하기");
        }
        if (v==iv) {
            menu.setHeaderTitle("이미지 메뉴");
            menu.add(0,5,0,"음성인식"); menu.add(0,6,0,"안구인식");
        }
    }
    public boolean onContextItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case 0 : btn.setTextColor(Color.RED); break;
            case 1 : btn.setTextColor(Color.BLUE); break;
            case 2 : btn.setTextColor(Color.GREEN); break;
            case 3 : Toast.makeText(getApplicationContext(),"복사했다고 하고",
                        Toast.LENGTH_SHORT).show(); break;
            case 4 : Toast.makeText(getApplicationContext(),"잘라냈다고 하고",
                    Toast.LENGTH_SHORT).show(); break;
            case 5 : Toast.makeText(getApplicationContext(),"음성인식 했다",
                    Toast.LENGTH_SHORT).show(); break;
            case 6 : Toast.makeText(getApplicationContext(),"안구인식 했다",
                    Toast.LENGTH_SHORT).show(); break;
        }
        return true;
    }
}