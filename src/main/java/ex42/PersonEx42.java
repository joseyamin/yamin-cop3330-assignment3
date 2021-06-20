package ex42;


import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonEx42 {
    private String firstName;
    private String lastName;
    private String salary;

    public void readPerson(Scanner in) throws FileNotFoundException {
        //read in line
        //split info into array
        //store it accordingly
        String str=in.nextLine();
        List<String> infoList = Arrays.asList(str.split(","));
        lastName=infoList.get(0);
        firstName= infoList.get(1);
        salary=infoList.get(2);
    }

    public String getFirstName(){
        //return first name
        return firstName;
    }
    public String getLastName(){
        //return last name
        return lastName;
    }

    public String toString(){
        //return last, first, salary all with nice format
        return String.format("%-15s %-15s %-15s", lastName, firstName,salary);
    }
}
