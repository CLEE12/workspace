package com.ch.a0702xmloptionmenu;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.jjajang:
                Toast.makeText(getApplicationContext(),"비오는 날엔 짜장에 고량주",
                        Toast.LENGTH_SHORT).show(); break;
            case R.id.jjambong:
                Toast.makeText(getApplicationContext(),"해장에는 짬뽕에 소주",
                        Toast.LENGTH_SHORT).show(); break;
            case R.id.udong:
                Toast.makeText(getApplicationContext(),"우울할 땐 우동에 청하",
                        Toast.LENGTH_SHORT).show(); break;
            case R.id.mandoo:
                Toast.makeText(getApplicationContext(),"서비스에는 만두에 고추",
                        Toast.LENGTH_SHORT).show(); break;
        }
        return true;
    }
}