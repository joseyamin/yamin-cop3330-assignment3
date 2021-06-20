package ex41;


import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;

    public void readPerson(Scanner in) throws FileNotFoundException {
        //read in line and store first and last name
        //save everything before ',' to first name
        //save everything after to last
        String line=in.nextLine();
        int commaIndex=line.indexOf(",");
        lastName=line.substring(0,commaIndex);
        firstName=line.substring(commaIndex+2,line.length());
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
        //return last, first
        return lastName+", "+firstName;
    }

    public static Comparator<Person> COMPARE_BY_NAME = new Comparator<Person>() {
        public int compare(Person one, Person other) {
            return (one.getLastName()+one.getFirstName()+one).compareTo(other.getLastName()+other.getFirstName());
        }
    };
}
