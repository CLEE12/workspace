package com.ch.a0701optionmenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(1,0,0,"짬뽕");
        menu.add(1,1,0,"짜장");
        SubMenu sm = menu.addSubMenu(1,4,0,"기타");
        sm.add(1,2,0,"우동");
        sm.add(1,3,0,"만두");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case 0 : Toast.makeText(getApplicationContext(),"해장에는 짬뽕",
                        Toast.LENGTH_SHORT).show();  break;
            case 1 : Toast.makeText(getApplicationContext(),"심심할 때 짜장",
                        Toast.LENGTH_SHORT).show();  break;
            case 2 : Toast.makeText(getApplicationContext(),"우울할 때 우동",
                        Toast.LENGTH_SHORT).show();  break;
            case 3 : Toast.makeText(getApplicationContext(),"서비스는 만두",
                        Toast.LENGTH_SHORT).show();  break;
        }
        return true;
    }
}