package com.example.blockchain_blackbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class StorageActivity extends AppCompatActivity {
    Button btn_cur_cur;
    Button btn_cur_in_req;
    Button btn_cur_sto_playvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur_storage);

        btn_cur_cur = findViewById(R.id.btn_cur_cur);
        btn_cur_in_req = findViewById(R.id.btn_cur_in_req);
        btn_cur_sto_playvideo = findViewById(R.id.btn_cur_sto_playvideo);

        btn_cur_sto_playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StorageActivity.this, StoPlayActivity.class);
                startActivity(intent);
            }
        });
        btn_cur_cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StorageActivity.this, CurActivity.class);
                startActivity(intent);
            }
        });
        btn_cur_in_req.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StorageActivity.this, RequestActivity.class);
                startActivity(intent);
            }
        });
    }
}
