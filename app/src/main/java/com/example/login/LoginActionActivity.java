package com.example.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.login.R;

public class LoginActionActivity extends Activity {

    TextView nim, nama;
    String get_nim, get_nama;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginaction);

        nim = (TextView) findViewById(R.id.nim_textView);
        nama = (TextView) findViewById(R.id.nama_textView);


        Bundle b = getIntent().getExtras();

        get_nim = b.getString("parse_nim");
        get_nama = b.getString("parse_nama");

        nim.setText("NIM : "+get_nim);
        nama.setText("Nama : "+get_nama);


    }
}