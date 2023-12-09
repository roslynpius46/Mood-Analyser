package com.bridgelabz.moodanalyser;

public class Main {
    public static void main(String[] args) {
        try {

            // Test Case 3
            MoodAnalyser moodAnalyser7 = new MoodAnalyser(null);
            System.out.println("Test Case 3: " + moodAnalyser7.analyseMood());
            // Test Case 3.1
            MoodAnalyser moodAnalyser8 = new MoodAnalyser("");
            System.out.println("Test Case 3.1: " + moodAnalyser8.analyseMood());

        }
        catch (MoodAnalysisException e) {
            System.out.println("Exception: " + e.getMessage() + ", Error: " + e.error);
        }

    }
}