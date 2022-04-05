package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;
    private Button countUp;
    private Button mZero;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount= (TextView) findViewById(R.id.show_count);
        mZero = findViewById(R.id.button_zero);
        countUp= findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount ++;
        if (mShowCount != null){
            mShowCount.setText(String.format(Locale.ENGLISH, "%d", mCount));
        }
        mZero.setBackgroundColor(getResources().getColor(R.color.pink));
        mZero.setClickable(true);

        switch (mCount % 2){
//            if mCount mod 2 is 0, number is even otherwise odd
            case 0: mShowCount.setBackgroundColor(Color.YELLOW);
                break;
            case 1: mShowCount.setBackgroundColor(Color.CYAN);
            default: break;
        }
    }

    public void zero(View view) {
            mCount = 0;
            mShowCount.setText(String.valueOf(mCount));

            view.setClickable(false);
            view.setBackgroundColor(Color.GRAY);
            countUp.setBackgroundColor(getResources().getColor(R.color.black));
        }
    }

