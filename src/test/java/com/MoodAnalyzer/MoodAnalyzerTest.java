package com.MoodAnalyzer;



import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MoodAnalyzerTest{

   
    @Test
    public void given_Happy_Mood_should_Return_Happy()
    {
    	MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In A HAPPY Mood");
        assertEquals("HAPPY", mood); 
    }
}
