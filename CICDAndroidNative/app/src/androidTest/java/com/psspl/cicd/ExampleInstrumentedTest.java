package com.psspl.cicd;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mainActivity=new ActivityTestRule<MainActivity>(MainActivity.class);
    @Test
    public void useAppContext() throws Exception {


        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.psspl.cicd", appContext.getPackageName());

        //test
        Espresso.onView(ViewMatchers.withId(R.id.eteditbxo)).perform(ViewActions.clearText());
        Espresso.onView(ViewMatchers.withId(R.id.eteditbxo)).perform(ViewActions.typeText("Test"));
        Thread.sleep(2000);
        Espresso.onView(ViewMatchers.withId(R.id.eteditbxo)).check(ViewAssertions.matches(ViewMatchers.withText("Test")));

    }
}
