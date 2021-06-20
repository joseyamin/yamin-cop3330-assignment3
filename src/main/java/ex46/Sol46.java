package ex46;

import java.io.FileNotFoundException;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Create a program that reads in a file named `exercise46_input.txt` and counts the frequency of words in the file. Then construct a histogram displaying the words and the frequency, and display the histogram to the screen.
 */
public class Sol46 {
    public static void main(String[] args) throws FileNotFoundException {
        FrequencyFinder frequencyFinder=new FrequencyFinder();
        //add up all words
        frequencyFinder.findWordsFrequency();
        //sort greatest to least
        frequencyFinder.sortByFreq();
        //print it
        frequencyFinder.displayHistogram();
    }
}
