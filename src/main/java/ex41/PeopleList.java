package ex41;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeopleList {
    private ArrayList<Person> peopleArrayList=new ArrayList<Person>();

    public void readInPeople(Scanner in) throws FileNotFoundException {
        //create multiple persons
        //tell them to read in the info
        //store it in array
        while(in.hasNextLine()){
            Person person=new Person();
            person.readPerson(in);
            peopleArrayList.add(person);
        }
    }
    public void sortList(){
        //call sort function
        Collections.sort(peopleArrayList,Person.COMPARE_BY_NAME);
    }
    public String printList(){
        //use string to add title
        //loop and add each name
        //return string
        String str="Total of "+peopleArrayList.size()+" names\n"+"--------------------------------------\n";
        for(Person person: peopleArrayList){
            str+=person+"\n";
        }
        return str;
    }
}
