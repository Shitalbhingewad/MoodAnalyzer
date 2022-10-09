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
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisException.Exception_Type.NULL,e.type);
        }
    }
}