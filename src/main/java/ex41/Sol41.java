package ex41;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Sol41 {
    public static void main(String[] args) throws IOException {

        //read in people from in file
        //sort list
        //print list to out file
        PeopleList peopleList=new PeopleList();
        File ifp = new File("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_input.txt");
        FileWriter ofp=new FileWriter("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\main\\java\\ex41\\exercise41_output.txt");
        Scanner in=new Scanner(ifp);

        peopleList.readInPeople(in);

        peopleList.sortList();

        ofp.write(peopleList.printList());

        ofp.close();
    }

}
