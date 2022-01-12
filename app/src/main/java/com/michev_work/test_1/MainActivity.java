package com.michev_work.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView tview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tview = findViewById(R.id.textView);
    }

    public void onClickCounter(View view) {
        counter++;
        tview.setText(String.valueOf(counter));

    }
}