package com.ahmed3v.codelabstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView countTextView;
    private Button toastButton, countButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countTextView = findViewById(R.id.count_text_view);
        toastButton = findViewById(R.id.toast_btn);
        countButton = findViewById(R.id.count_btn);

        toastButton.setOnClickListener(v -> {

            Toast.makeText(this , "Hello Toast!" , Toast.LENGTH_SHORT).show();
        });

        countButton.setOnClickListener(v -> {
            countUp();
        });
    }

    private void countUp(){
        mCount++;

        if(countTextView != null)
            countTextView.setText(String.valueOf(mCount));

    }
}