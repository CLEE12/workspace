package com.ch.a0408calcul;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2; Button add, min, mul, div; TextView tv;
    Button[] num = new Button[10]; String num1, num2; int result;
    Integer[] numR = { R.id.num0,R.id.num1,R.id.num2,R.id.num3,R.id.num4,
                       R.id.num5,R.id.num6,R.id.num7,R.id.num8,R.id.num9};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText)findViewById(R.id.edNum1);
        ed2 = (EditText)findViewById(R.id.edNum2);
        tv = (TextView)findViewById(R.id.result);
        add = (Button)findViewById(R.id.add);
        min = (Button)findViewById(R.id.min);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        for(int i = 0; i < 10;i++) {
            num[i] = (Button)findViewById(numR[i]);
        }
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                try {
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    tv.setText("결과 : " + result);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "숫자가 없으면 연산 할 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                try {
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    tv.setText("결과 : " + result);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "숫자가 없으면 연산 할 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                try {
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    tv.setText("결과 : " + result);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                            "숫자가 없으면 연산 할 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                try {
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tv.setText("결과 : " + result);
                }catch (Exception e) {
                    Toast.makeText(getApplicationContext(),
                        "숫자가 없거나 분모가 0이면 연산 할 수 없습니다",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        for(int i=0;i <10; i++) {
            final int index = i;
            num[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (ed1.isFocused()) {
                        num1 = ed1.getText().toString() +
                                num[index].getText().toString();
                        ed1.setText(num1);
                    } else if (ed2.isFocused()) {
                        num2 = ed2.getText().toString() +
                                num[index].getText().toString();
                        ed2.setText(num2);
                    } else {
                        Toast.makeText(getApplicationContext(),
                               "커서를 에데터 1또는 2에 위치하고 숫자버튼 클릭",
                              Toast.LENGTH_SHORT).show();
                    }
                }
             });
        }
    }
}