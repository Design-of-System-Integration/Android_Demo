package com.example.blockchain_blackbox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DrivingActivity extends AppCompatActivity {
    Button btn_start_drive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_drive);
        btn_start_drive = findViewById(R.id.btn_start_drive);

        btn_start_drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DrivingActivity.this, DrivingListActivity.class);
                startActivity(intent);
            }
        });
    }
}
