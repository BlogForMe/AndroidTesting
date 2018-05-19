package com.jon.test.espresso;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.jon.test.R;


public class InstrumentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrument);
    }


    public void sayClick(View v) {
        TextView textView = findViewById(R.id.tv_name);
        EditText editText = findViewById(R.id.et_name);
        textView.setText("Say HELLO!" + editText.getText().toString() + "!");
    }

}
