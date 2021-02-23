package com.kikitect.appsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kikitect.sdk.StringUtil;

public class MainActivity extends AppCompatActivity {

    Button hasil;
    EditText angka1;
    TextView vangka11;
    String vangka1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.angka1);
        hasil = findViewById(R.id.hasil);
        vangka11 = findViewById(R.id.vangka11);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vangka1 =  angka1.getText().toString();

                StringUtil stringUtil = new StringUtil();
                vangka1 = stringUtil.reverse(vangka1);
                vangka11.setText(vangka1);
            }
        });

    }
}