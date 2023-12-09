package com.bridgelabz.moodanalyser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to mood analyser problem");

        MoodAnalyser moodAnalyser1 = new MoodAnalyser("I am in Sad Mood");
        System.out.println("Test Case 1: " + moodAnalyser1.analyseMood());

    }
}