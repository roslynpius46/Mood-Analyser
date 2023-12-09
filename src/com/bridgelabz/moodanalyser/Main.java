package com.bridgelabz.moodanalyser;

public class Main {
    public static void main(String[] args) throws MoodAnalysisException {
        System.out.println("Welcome to mood analyser problem");

        MoodAnalyser moodAnalyser1 = new MoodAnalyser(null);
        System.out.println("Test Case 1: " + moodAnalyser1.analyseMood());

    }
}