package com.bridgelabz.moodanalyser;

public class MoodAnalysisException extends Exception{
    public MoodAnalysisError error;

    public MoodAnalysisException(MoodAnalysisError error, String message) {
        super(message);
        this.error = error;
    }
}