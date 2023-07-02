package com.example.tomandjerry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean isTomVisible = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eraseTom(View view) {

        if (isTomVisible) {
            ImageView tomImageView = findViewById(R.id.tomImageView);
            tomImageView.animate().alpha(0).setDuration(2000);

            ImageView jerryImageView = findViewById(R.id.jerryImageView);
            jerryImageView.animate().alpha(1).setDuration(2000);

            isTomVisible = false;
        } else {
            ImageView tomImageView = findViewById(R.id.tomImageView);
            tomImageView.animate().alpha(1).setDuration(2000);

            ImageView jerryImageView = findViewById(R.id.jerryImageView);
            jerryImageView.animate().alpha(0).setDuration(2000);

            isTomVisible = true;
        }

    }

    public void eraseJerry(View view) {
    }
}