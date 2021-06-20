package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FrequencyFinder {
    public String textStr;
    public ArrayList<Word> wordList=new ArrayList<Word>();

    public void findWordsFrequency() throws FileNotFoundException {
        //while scanner has a next (word) add the word
        File ifp=new File("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\main\\java\\ex46\\exercise46_input.txt");
        Scanner in=new Scanner(ifp);
        while(in.hasNext()) {
            addFrequencyToWord(in.next());
        }
    }

    private void addFrequencyToWord(String word){
        //loop through and find word and add +1 to frequency
        for(Word tmp :wordList){
            if(tmp.word.equalsIgnoreCase(word)){
                tmp.frequency++;
                return;
            }
        }
        //if word not found then add it
        addWord(word);
    }

    private void addWord(String word){
        //create new word and add it to list
        //set word and freq to 1
        Word newWord=new Word();
        newWord.word=word;
        newWord.frequency=1;
        wordList.add(newWord);
    }

    public void displayHistogram(){
        //loop through words print words
        //after a word is printed loop for amt of words and print *
        for(Word tmp :wordList){
            System.out.print(String.format("%-10s",(tmp.word+":")));
            for(int i=0;i<tmp.frequency;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void sortByFreq(){
        //sort using collections.sort
        //sort greatest to least
        Collections.sort(wordList,Word.COMPARE_BY_FREQ );;
    }

}
