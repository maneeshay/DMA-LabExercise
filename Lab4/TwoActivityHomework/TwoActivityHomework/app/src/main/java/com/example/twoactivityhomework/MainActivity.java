package com.example.twoactivityhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {


    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_COUNT = "helloToastHW1.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount ++;
        if (mShowCount != null){
            mShowCount.setText(String.format(Locale.ENGLISH, "%d", mCount));
        }
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_COUNT, mCount);
        startActivity(intent);
    }
}