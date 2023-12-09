package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
    private String message;

    /**
     * @desc get message
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @desc set message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     *
     * @desc constructor to initialize empty message
     */
    public MoodAnalyser() {
        this.message = "";
    }


    /**
     * @desc constructor to initialize message
     * @param message Input message
     */
    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * @desc constructor to initialize message
     * @return mood
     */
    public String analyseMood()  {
        if (message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}