package com.MoodAnalyzer;

public class MoodAnalyzerMain {
    private String message;

    // Constructor
    public MoodAnalyzerMain() {
    }

    public MoodAnalyzerMain(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (this.message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}