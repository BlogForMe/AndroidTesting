package com.jon.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btText = findViewById(R.id.bt_text);
        btText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Button) v).setText("Testing Android Rocks!");
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

}
