package com.example.project4_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRes;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단한 계산기");

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);
        num1 = edit1.toString();
        num2 = edit2.toString();

        btnAdd = findViewById(R.id.BtnAdd);
        btnSub = findViewById(R.id.BtnSub);
        btnMul = findViewById(R.id.BtnMul);
        btnDiv = findViewById(R.id.BtnDiv);
        btnRes = findViewById(R.id.BtnRes);

        textResult = findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if (num1.equals("숫자1") || num2.equals("숫자2")) {
                    Toast.makeText(getApplicationContext(), "값을 입력하세요.", Toast.LENGTH_LONG).show();
                }
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                textResult.setText(String.valueOf("계산결과: " + result));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                textResult.setText(String.valueOf("계산결과: " + result));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                textResult.setText(String.valueOf("계산결과: " + result));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                textResult.setText(String.valueOf("계산결과: " + result));
            }
        });

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                result = Double.parseDouble(num1) % Double.parseDouble(num2);
                textResult.setText(String.valueOf("계산결과: " + result));
            }
        });
    }
}
