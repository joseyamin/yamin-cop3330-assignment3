package ex46;

import junit.framework.TestCase;

import java.io.FileNotFoundException;

public class FrequencyFinderTest extends TestCase {

    public void testFindWordsFrequency() throws FileNotFoundException {
        FrequencyFinder frequencyFinder=new FrequencyFinder();
        frequencyFinder.findWordsFrequency();
        String expected="badger:   *******\n" +
                "mushroom: **\n" +
                "snake:    *\n";
        frequencyFinder.sortByFreq();

        String actual="";
        for(Word tmp :frequencyFinder.wordList) {
            actual += (String.format("%-10s", (tmp.word + ":")));
            for (int i = 0; i < tmp.frequency; i++) {
                actual += "*";
            }
            actual += "\n";
        }
        assertEquals(expected,actual);
    }
}