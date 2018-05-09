package com.jon.test.robolectric;

import com.jon.test.MainActivity;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.shadows.ShadowLog;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void  setUp(){
        mainActivity = Robolectric.setupActivity(MainActivity.class);
        ShadowLog.stream = System.out;
    }


    @Test
    public  void  testMainActivity(){
        Assert.assertNotNull(mainActivity);
    }

}
