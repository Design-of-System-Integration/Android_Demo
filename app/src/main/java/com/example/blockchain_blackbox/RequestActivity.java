package com.example.blockchain_blackbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RequestActivity extends AppCompatActivity {
    Button btn_cur_cur;
    Button btn_cur_in_storage;
    Button btn_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur_req);

        btn_cur_cur = findViewById(R.id.btn_cur_cur);
        btn_cur_in_storage = findViewById(R.id.btn_cur_in_storage);
        btn_home = findViewById(R.id.btn_home);

        btn_cur_cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestActivity.this, CurActivity.class);
                startActivity(intent);
            }
        });
        btn_cur_in_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestActivity.this, StorageActivity.class);
                startActivity(intent);
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RequestActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
