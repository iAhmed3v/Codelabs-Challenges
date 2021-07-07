package com.ahmed3v.codelabstest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView articleTitle, articleSubTitle, articleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articleTitle = findViewById(R.id.article_heading_text_view);
        articleSubTitle = findViewById(R.id.article_subheading_text_view);
        articleText = findViewById(R.id.article_text_view);

    }

}