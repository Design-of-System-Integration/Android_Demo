package com.example.blockchain_blackbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrivingListActivity extends AppCompatActivity {
    Button btn_drive_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_list);
        btn_drive_list = findViewById(R.id.btn_drive_list);
        btn_drive_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrivingListActivity.this, DrivingListDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}