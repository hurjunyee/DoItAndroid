package com.example.administrator.doitmission_01;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImage1;
    ImageView mImage2;

    Button mButtonUp;
    Button mButtonDown;

    HorizontalScrollView mScrollView1;
    HorizontalScrollView mScrollView2;

    BitmapDrawable bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        mImage1 = (ImageView) findViewById(R.id.imageView1);
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.penguins);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();
        mImage1.getLayoutParams().width = bitmapWidth;
        mImage1.getLayoutParams().height = bitmapHeight;

        mImage2 = (ImageView) findViewById(R.id.imageView2);
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.penguins);
        bitmapWidth = bitmap.getIntrinsicWidth();
        bitmapHeight = bitmap.getIntrinsicHeight();
        mImage2.getLayoutParams().width = bitmapWidth;
        mImage2.getLayoutParams().height = bitmapHeight;

        mScrollView1 = (HorizontalScrollView) findViewById(R.id.scrollView1);
        mScrollView2 = (HorizontalScrollView) findViewById(R.id.scrollView2);

        mButtonUp = (Button) findViewById(R.id.btn_up);
        mButtonUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScrollView2.setVisibility(View.INVISIBLE);
                mScrollView1.setVisibility(View.VISIBLE);
            }
        });

        mButtonDown = (Button) findViewById(R.id.btn_down);
        mButtonDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mScrollView1.setVisibility(View.INVISIBLE);
                mScrollView2.setVisibility(View.VISIBLE);
            }
        });

    }
}
