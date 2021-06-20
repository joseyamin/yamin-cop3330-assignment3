package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize. Replace each occurrence with use. Write the modified file to a new file.
Constraints
Prompt for the name of the output file.
Write the output to a new file.
*/
public class Sol45 {
    public static void main(String[] args) throws IOException {
        FileEditor fileEditor=new FileEditor();
        //read in file and store
        fileEditor.storeInputStr();
        //edit file
        fileEditor.editFileStr();
        //get and print string to ofp
        FileWriter ofp=new FileWriter("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_output.txt");
        ofp.write(fileEditor.getFileStr());
        ofp.close();
    }
}
