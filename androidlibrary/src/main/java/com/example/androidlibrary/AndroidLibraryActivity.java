package com.example.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_library);

        TextView jokes;
        jokes = findViewById(R.id.jokes);

        Intent intent = getIntent();
        String joke = intent.getStringExtra("jokes");

            jokes.setText(joke);


//        String joke = getIntent().getStringExtra("jokes");
//        jokes.setText(joke);

    }
}
