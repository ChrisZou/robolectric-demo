package com.chriszou.testrobolectric;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Chris on 6/14/15.
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }
}
