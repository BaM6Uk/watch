package com.example.kulagin_max_watch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kulagin_max_watch.databinding.ActivityMainBinding;

import java.util.concurrent.TimeUnit;

public class MainActivity extends Activity {
    ImageView logoo;
    private TextView mTextView;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        logoo = findViewById(R.id.zoomut);
        final Animation animationRotate = AnimationUtils.loadAnimation(this, R.anim.shrink);
        logoo.startAnimation(animationRotate);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(3);
                    Intent intent = new Intent(MainActivity.this, login.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }
}