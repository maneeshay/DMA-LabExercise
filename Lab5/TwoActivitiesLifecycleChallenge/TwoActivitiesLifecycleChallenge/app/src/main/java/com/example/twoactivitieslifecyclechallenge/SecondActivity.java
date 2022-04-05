package com.example.twoactivitieslifecyclechallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private Button replyCake;
    private Button replyMutton;
    private Button replySnickers;
    private Button replyBanana;
    private Button replyCurd;
    private Button replyChicken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replyCake = findViewById(R.id.buttonCake);
        replyMutton = findViewById(R.id.buttonMutton);
        replySnickers = findViewById(R.id.buttonSnickers);
        replyBanana = findViewById(R.id.buttonBanana);
        replyCurd = findViewById(R.id.buttonCurd);
        replyChicken = findViewById(R.id.buttonChicken);
    }

    public void returnReplyCake(View view) {
        String reply = replyCake.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyMutton(View view) {
        String reply = replyMutton.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void returnReplySnickers(View view) {
        String reply = replySnickers.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyBanana(View view) {
        String reply = replyBanana.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyCurd(View view) {
        String reply = replyCurd.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyChicken(View view) {
        String reply = replyChicken.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}