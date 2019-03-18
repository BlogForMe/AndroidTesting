package com.jon.test.robolectric;

import android.widget.Button;

import com.jon.test.BuildConfig;
import com.jon.test.MainActivity;
import com.jon.test.R;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Created by jon on 2/25/18.
 */


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class roboleTest {

    @Test
    public  void  clickingButton_shouldChangeResultsViewText()throws Exception{
        MainActivity  mainActivity = Robolectric.setupActivity(MainActivity.class);

        Button button = mainActivity.findViewById(R.id.bt_text);

        button.performClick();
        Assert.assertThat(button.getText().toString(), CoreMatchers.equalTo("Testing Android Rocks!"));


    }
}
