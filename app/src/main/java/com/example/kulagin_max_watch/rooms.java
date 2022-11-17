package com.example.kulagin_max_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class rooms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);
    }
    public void gogo(View view) {
        Intent intent = new Intent(rooms.this, devices.class);
        startActivity(intent);
    }
}