package ex42;

import ex41.PeopleList;
import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PeopleListEx42Test extends TestCase {

    public void testPrintList() throws FileNotFoundException {
        PeopleListEx42 peopleList=new PeopleListEx42();
        File ifp=new File("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\test\\java\\ex42\\exercise41_input_ExampleCase.txt");
        Scanner in=new Scanner(ifp);
        peopleList.readInPeople(in);
        String actual="Last            First           Salary         \n" +
                "-------------------------------------\n" +
                "Ling            Mai             55900          \n" +
                "Johnson         Jim             56500          \n" +
                "Jones           Aaron           46000          \n" +
                "Jones           Chris           34500          \n" +
                "Swift           Geoffrey        14200          \n" +
                "Xiong           Fong            65000          \n" +
                "Zarnecki        Sabrina         51500          \n";
        assertEquals(peopleList.printList(),actual);
    }
}