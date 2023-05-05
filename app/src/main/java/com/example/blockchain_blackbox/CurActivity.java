package com.example.blockchain_blackbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CurActivity extends AppCompatActivity {
    Button btn_playvideo;
    Button btn_cur_in_req;
    Button btn_cur_in_storage;
    Button btn_home;
    Button btn_cur_addvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur_cur);

        // 버튼 초기화
        btn_playvideo = findViewById(R.id.btn_playvideo);
        btn_cur_in_req = findViewById(R.id.btn_cur_in_req);
        btn_cur_in_storage = findViewById(R.id.btn_cur_in_storage);
        btn_home = findViewById(R.id.btn_home);
        btn_cur_addvideo=findViewById(R.id.btn_addvideo);

        // OnClickListener 등록
        btn_playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurActivity.this, StoPlayActivity.class);
                startActivity(intent);
            }
        });
        btn_cur_addvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurActivity.this, AddVideoActivity.class);
                startActivity(intent);
            }
        });
        btn_cur_in_req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurActivity.this, RequestActivity.class);
                startActivity(intent);
            }
        });
        btn_cur_in_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurActivity.this, StorageActivity.class);
                startActivity(intent);
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
