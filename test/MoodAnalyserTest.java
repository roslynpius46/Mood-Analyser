import com.bridgelabz.moodanalyser.MoodAnalyser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyserTest {
    /**
     *
     @desc Test case for message “I am in Sad Mood” message
    */

    @Test
    public void testAnalyseMoodSadMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Sad Mood");
        assertEquals("SAD", moodAnalyser.analyseMood());
    }

    /**
     *
     * @desc Test case for message “I am in Any Mood” message
    */

    @Test
    public void testAnalyseMoodAnyMessage() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Any Mood");
        assertEquals("HAPPY", moodAnalyser.analyseMood());

    }

    /**
     *
     * @desc Test case for message “I am in Sad Mood” message through Constructors
     */

    @Test
    public void testAnalyseMoodSadMessageConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        assertEquals("SAD", moodAnalyser.analyseMood());

    }
    
    /**
     *
     * @desc Test case for message “I am in Any Mood” message through Constructors
    */
    @Test
    public void testAnalyseMoodAnyMessageConstructors() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        assertEquals("HAPPY", moodAnalyser.analyseMood());

    }

}