package com.example.appdz.espresso;

import androidx.test.rule.ActivityTestRule;

import com.example.appdz.MainActivity;
import com.example.appdz.R;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onClick() {
        onView(withId(R.id.buttonSayHello)).perform(click());
        onView(withId(R.id.textVievHello)).check(matches(withText("Hello!")));
    }
}
