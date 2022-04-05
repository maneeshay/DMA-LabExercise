package com.example.twoactivitieschallange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.Two Activities challenge.extra.TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void paragraph(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        switch (view.getId()){
            case R.id.button:
                intent.putExtra(EXTRA_TEXT, getString(R.string.displayText_one)); startActivity(intent);
                break;
            case R.id.button2:
                intent.putExtra(EXTRA_TEXT, getString(R.string.displayText_two)); startActivity(intent);
                break;
            case R.id.button3:
                intent.putExtra(EXTRA_TEXT, getString(R.string.displayText_three)); startActivity(intent);
                break;
            default:
                Toast.makeText(MainActivity.this, "There was an error", Toast.LENGTH_LONG).show();
                break;
        }
    }
}