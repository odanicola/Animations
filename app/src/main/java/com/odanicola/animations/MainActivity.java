package com.odanicola.animations;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void doRotate(View view){
        //Rotating image
        ImageView bart = (ImageView) findViewById(R.id.imageView3);
        bart.animate().rotation(1800f).setDuration(2000);

    }

    public void doScale(View view){
        //scaling image to shrink
        ImageView bart = (ImageView) findViewById(R.id.imageView3);
        bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        doRotate(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        ImageView bart = (ImageView) findViewById(R.id.imageView3);
        bart.setTranslationX(-1000f);
        */
    }
}
