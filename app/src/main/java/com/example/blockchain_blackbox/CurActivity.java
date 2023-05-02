package com.example.blockchain_blackbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CurActivity extends AppCompatActivity {
    Button btn_playvideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cur_cur);

        // 버튼 초기화
        btn_playvideo = findViewById(R.id.btn_playvideo);

        // OnClickListener 등록
        btn_playvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurActivity.this, PlayActivity.class);
                startActivity(intent);
            }
        });
    }
}
