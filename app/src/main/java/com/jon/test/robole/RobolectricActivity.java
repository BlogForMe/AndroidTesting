package com.jon.test.robole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jon.test.R;

/**
 * https://juejin.im/post/5b57e3fbf265da0f47352618
 */
public class RobolectricActivity extends AppCompatActivity {

    private TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robolectric);

        tvShow= findViewById(R.id.tv_show);
        findViewById(R.id.bt_click).setOnClickListener(v->{
            tvShow.setText("Robolectric Rocks!");
        });
    }
}
