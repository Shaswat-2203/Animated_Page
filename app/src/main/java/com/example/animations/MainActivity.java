package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout=findViewById(R.id.layout);
        AnimationDrawable animation= (AnimationDrawable) layout.getBackground();
        animation.setEnterFadeDuration(2000);
        animation.setExitFadeDuration(2000);
        animation.start();
    }
}
