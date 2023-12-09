import com.bridgelabz.moodanalyser.MoodAnalyser;
import com.bridgelabz.moodanalyser.MoodAnalysisError;
import com.bridgelabz.moodanalyser.MoodAnalysisException;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MoodAnalyserTest {
    /**
     *
     @desc Test case for message “I am in Sad Mood” message
    */

    @Test
    public void testSadMessage() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Sad Mood");
        assertEquals("SAD", moodAnalyser.analyseMood());
    }

    /**
     *
     * @desc Test case for message “I am in Any Mood” message
    */

    @Test
    public void testAnyMessage() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Any Mood");
        assertEquals("HAPPY", moodAnalyser.analyseMood());

    }

    /**
     *
     * @desc Test case for message “I am in Sad Mood” message through Constructors
     */

    @Test
    public void testSadMessageConstructor() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        assertEquals("SAD", moodAnalyser.analyseMood());

    }
    
    /**
     *
     * @desc Test case for message “I am in Any Mood” message through Constructors
    */
    @Test
    public void testAnyMessageConstructors() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        assertEquals("HAPPY", moodAnalyser.analyseMood());

    }

    /**
     *
     * @desc Test case for null message
     */
    @Test
    public void testNullMessage() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            assertEquals("HAPPY", moodAnalyser.analyseMood());
        }
        catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.NULL, e.error);
            assertEquals("Mood should not be null", e.getMessage());
        }
    }

    @Test
    public void testAnalyseMoodEmptyMessageShouldThrowMoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
            fail("Expected MoodAnalysisException but did not occur");
        } catch (MoodAnalysisException e) {
            assertEquals(MoodAnalysisError.EMPTY, e.error);
            assertEquals("Mood should not be empty", e.getMessage());
        }
    }

}