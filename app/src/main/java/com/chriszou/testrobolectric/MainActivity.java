package com.chriszou.testrobolectric;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        testCircularProgressView();
    }


    private boolean runed;
    private void testCircularProgressView() {
    //        CircularProgressView progressView = (CircularProgressView) findViewById(R.id.progress_view);
//        System.out.println("oncreate");
//        try {
////            progressView.startAnimation();
//        } catch (Exception e) {
//            System.out.println("exception happened when start animation");
//            e.printStackTrace();
//        }
//        System.out.println("oncreate end");
////        testPostRunnable();
    }

    private void testPostRunnable() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                runed = true;
                System.out.println("post delayed");
                Toast.makeText(MainActivity.this, "post delayed", Toast.LENGTH_SHORT).show();
            }
        }, 2000);
    }
}
