package com.ahmed3v.activitiesandintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE ="com.ahmed3v.android.activitiesandintents.extra.MESSAGE";

    private TextView messageTextView;
    private Button sendButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = findViewById(R.id.button_main);
        editText = findViewById(R.id.edit_text_main);
        messageTextView = findViewById(R.id.main_text_message);

       sendButton.setOnClickListener(v -> {

           String message = editText.getText().toString().trim();

           Intent intent = new Intent(MainActivity.this, SecondActivity.class);
           intent.putExtra(EXTRA_MESSAGE, message);
           startActivity(intent);
       });

        Intent intent = getIntent();

        String replayMessage = intent.getStringExtra(SecondActivity.EXTRA_REPLY);

        messageTextView.setText(replayMessage);
    }

}