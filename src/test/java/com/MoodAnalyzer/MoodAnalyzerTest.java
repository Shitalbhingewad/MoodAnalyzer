package com.MoodAnalyzer;

import static org.junit.Assert.assertSame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am In Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        assertSame("SAD", mood);

    }

    // Test case for Happy mood

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am In Happy Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }
    @Test
    public void given_NULLMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }
}
