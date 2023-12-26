package com.example.fve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        Intent intent = getIntent();
        String videoUrl = intent.getStringExtra("videoUrl");
        String description = intent.getStringExtra("description");

        // Инициализация видео - можешь использовать WebView для отображения YouTube видео
        WebView webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(videoUrl);

        // Отображение описания упражнения
        TextView txtDescription = findViewById(R.id.txtDescription);
        txtDescription.setText(description);
    }
}