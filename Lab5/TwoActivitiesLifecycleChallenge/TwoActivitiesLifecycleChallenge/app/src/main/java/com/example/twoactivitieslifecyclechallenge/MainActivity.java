package com.example.twoactivitieslifecyclechallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;
    private TextView replyTextView;
    private TextView replyTextView2;
    LinearLayout listItems;
    private ArrayList<String> items = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItems = findViewById(R.id.list_items);

        if (savedInstanceState != null) {
            replyTextView.setText(savedInstanceState
                    .getString("reply_text"));
        }
    }
    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                //below code not working
                items.add(reply);
                this.renderList();
            }
        }
    }

    private void renderList(){
        this.listItems.removeAllViews();
        for(int i=0;i<items.size();i++){
            TextView item = new TextView(new ContextThemeWrapper(MainActivity.this,R.style.list_style ));
            item.setText(items.get(i));

            this.listItems.addView(item);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if(replyTextView != null){
            outState.putString("reply_text",replyTextView.getText().toString());
        }
    }

}