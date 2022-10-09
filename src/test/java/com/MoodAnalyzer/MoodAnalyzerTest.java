package com.MoodAnalyzer;



import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyzerTest{
//Test case for sad mood
    @Test
    public void given_Happy_Mood_should_Return_Sad()
    {
    	MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In A SAD Mood");
        assertEquals("SAD", mood); 
    }
    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        assertEquals("HAPPY", mood);
    }
}
