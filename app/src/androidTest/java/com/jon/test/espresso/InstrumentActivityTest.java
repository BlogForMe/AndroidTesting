package com.jon.test.espresso;



import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.jon.test.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;


@RunWith(AndroidJUnit4.class)
@LargeTest
public class InstrumentActivityTest {
    private static final String STRING_TO_BE_TYPED = "Jon";
    @Rule
    public ActivityTestRule<InstrumentActivity> instrumentActivityTestRule = new ActivityTestRule<>(InstrumentActivity.class);

    @Test
    public void sayHelloTest() {
        Espresso.onView(ViewMatchers.withId(R.id.et_name)).perform(ViewActions.typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());
        Espresso.onView(ViewMatchers.withText("Say HELLO")).perform(click());


        String expectedText = "Say HELLO!" + STRING_TO_BE_TYPED + "!";
        Espresso.onView(ViewMatchers.withId(R.id.tv_name)).check(ViewAssertions.matches(ViewMatchers.withText(expectedText)));
    }
}
