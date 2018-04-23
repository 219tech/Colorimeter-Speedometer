package com.example.androiddeveloper.colorimeter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int[] imageArray = { R.mipmap.criticalstatus, R.mipmap.poorstatus,R.mipmap.fairstatus,R.mipmap.goodstatus};
    int[] imageArray2 = { R.mipmap.critical,R.mipmap.poor,R.mipmap.fair,R.mipmap.good};

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Runnable runnable = new Runnable() {
            int i = 0;
            ImageView view = (ImageView)findViewById(R.id.imageView);
            ImageView view2=(ImageView)findViewById(R.id.imageView2);
            public void run() {
                view.setImageResource(imageArray[i]);
                view2.setImageResource(imageArray2[i]);
                i++;
                if (i > imageArray.length - 1) {
                    i = 0;
                }
                handler.postDelayed(this, 300);
            }
        };

      handler.postDelayed(runnable, 0);
    }
}
