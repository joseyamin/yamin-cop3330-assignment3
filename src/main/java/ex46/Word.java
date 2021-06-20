package ex46;

import java.util.Comparator;

public class Word {
    public String word;
    public int frequency;

    //sort greatest to least
    public static Comparator<Word> COMPARE_BY_FREQ = new Comparator<Word>() {
        public int compare(Word one, Word other) {
            return one.frequency < other.frequency ? 1 : one.frequency > other.frequency ? -1 : 0;
        }
    };
}
