package ex42;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeopleListEx42 {
    private ArrayList<PersonEx42> peopleArrayList=new ArrayList<PersonEx42>();

    public void readInPeople(Scanner in) throws FileNotFoundException {
        //create multiple persons
        //tell them to read in the info
        //store it in array
        while(in.hasNextLine()){
            PersonEx42 person=new PersonEx42();
            person.readPerson(in);
            peopleArrayList.add(person);
        }
    }

    public String printList(){
        //use string to add formatted title
        //loop and add each name
        //return string
        String str=String.format("%-15s %-15s %-15s\n","Last","First","Salary");
        str+="-------------------------------------\n";
        for(PersonEx42 person: peopleArrayList){
            str+=person+"\n";
        }
        return str;
    }
}
