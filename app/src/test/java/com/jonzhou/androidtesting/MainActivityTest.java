package com.jonzhou.androidtesting;


import android.content.Intent;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

/**
 * Created by A on 2018/1/23.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 26)
public class MainActivityTest {
    @Test
    public void testMainActivity() {
//        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
//        mainActivity.findViewById(R.id.bt_text).performClick();
//
//        Intent expectedIntent = new Intent(mainActivity, SecondActivity.class);
//        ShadowActivity shadowActivity = Shadows.shadowOf(mainActivity);
//        Intent actua1Intent = shadowActivity.getNextStartedActivity();
//        Assert.assertEquals(expectedIntent, actua1Intent);

        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        mainActivity.findViewById(R.id.bt_text).performClick();

        Intent expectedIntent = new Intent(mainActivity, SecondActivity.class);
        ShadowActivity shadowActivity = Shadows.shadowOf(mainActivity);
        Intent actualIntent = shadowActivity.getNextStartedActivity();
        Assert.assertEquals(expectedIntent, actualIntent);
    }
}
