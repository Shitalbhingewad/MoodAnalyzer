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
    public void given_SadMood_Should_Return_Sad() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertEquals("SAD", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Happy Mood");
        String mood;
        try {
            mood = moodAnalyser.analyseMood();
            assertEquals("HAPPY", mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void given_NullMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertSame(MoodAnalysisException.Exception_Type.NULL, e.type);
        }
    }

    @Test
    public void given_EmptyMood_Should_Throw_MoodAnalysisException() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            assertSame(MoodAnalysisException.Exception_Type.EMPTY, e.type);
        }
    }
}