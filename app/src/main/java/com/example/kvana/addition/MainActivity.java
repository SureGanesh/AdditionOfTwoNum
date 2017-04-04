package com.example.kvana.addition;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b;
    TextView ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText) findViewById(R.id.editText);
        et2=(EditText) findViewById(R.id.edit3);
        b= (Button) findViewById(R.id.btnadd);
        ans= (TextView) findViewById(R.id.tvans);

    }
    public void add(View v){
        int i=Integer.parseInt(et1.getText().toString());
        int j=Integer.parseInt(et2.getText().toString());
        int k= i+j;
        ans.setText("Ans is:" + k);


    }
}
