package com.example.kvana.addition;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    EditText et1, et2;
    Button btn_add;
    Button btn_substraction;
    Button btn_multiplication;
    Button btn_division;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.edit3);
        btn_add = (Button) findViewById(R.id.btn_add);
        ans = (TextView) findViewById(R.id.tvans);
        btn_add.setOnClickListener(this);
        btn_substraction = (Button) findViewById(R.id.btn_subtraction);
        btn_substraction.setOnClickListener(this);
        btn_multiplication = (Button) findViewById(R.id.btn_multiplication);
        btn_multiplication.setOnClickListener(this);
        btn_division = (Button) findViewById(R.id.btn_division);
        btn_division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = Integer.parseInt(et1.getText().toString());
        int j = Integer.parseInt(et2.getText().toString());
        switch (v.getId()) {
            case R.id.btn_add:
                int add = i + j;
                ans.setText("Ans is:" + add);
                break;
            case R.id.btn_subtraction:
                int sub = i - j;
                ans.setText("Ans is:" + sub);
                break;
            case R.id.btn_multiplication:
                int mul = i * j;
                ans.setText("Ans is:" + mul);
                break;
            case R.id.btn_division:
                int div = i / j;
                ans.setText("Ans is:" + div);
                break;
        }
    }
}

