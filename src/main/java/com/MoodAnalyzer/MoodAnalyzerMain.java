package com.MoodAnalyzer;

public class MoodAnalyzerMain {

	
    public MoodAnalyzerMain(){
    }

    public String analyseMood(String message) {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}

