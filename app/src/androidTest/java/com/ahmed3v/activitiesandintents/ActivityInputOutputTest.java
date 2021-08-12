package com.ahmed3v.activitiesandintents;

import
        android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.ahmed3v.activitiesandintents.MainActivity;
import com.ahmed3v.activitiesandintents.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.content.Context;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

/**
 * The app provides a text entry field and a Send button (the
 * button_main id). Clicking Send launches the Second activity with the entered
 * text shown in the main_text_header view of the Second activity.
 *
 * The first Espresso test performs a click on the main activity's button, and
 * checks to see if the main_text_header matches what is displayed. If it passes, it
 * means that the second activity was started. The test then clicks the second
 * activity's button, and checks to see if the text_header_reply matches what is
 * displayed. If it passes, it means that the main activity was started from the
 * second activity.
 *
 * The second test locates the view containing the editText_main view, enters
 * the text "This is a test." and clicks the main button. It then compares the
 * text_message with the assertion "This is a test." If it passes, it means that
 * the entered text was successfully passed to the text_message field.
 */
@RunWith(AndroidJUnit4.class)
public class ActivityInputOutputTest {

    @Rule
    public ActivityScenarioRule mActivityRule = new ActivityScenarioRule<> (MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ahmed3v.activitiesandintents" , appContext.getPackageName());
    }


    @Test
    public void ActivityLunch(){

        onView(withId(R.id.button_main)).perform(click());

        onView(withId(R.id.second_button)).perform(click());


    }


    @Test
    public void textInputOutput() {

        onView(withId(R.id.edit_text_main)).perform(typeText("This is a test."));
        onView(withId(R.id.button_main)).perform(click());

        onView(withId(R.id.text_message)).check(matches(withText("This is a test.")));
    }
}