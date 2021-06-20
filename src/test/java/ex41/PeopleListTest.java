package ex41;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PeopleListTest extends TestCase {

    public void testPrintListExampleCase() throws FileNotFoundException {
        PeopleList peopleList=new PeopleList();
        File ifp=new File("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\test\\java\\ex41\\exercise41_input_ExampleCase.txt");
        Scanner in=new Scanner(ifp);
        peopleList.readInPeople(in);
        peopleList.sortList();
        String actual="Total of 7 names\n" + "--------------------------------------\n" + "Johnson, Jim\n" + "Jones, Aaron\n" + "Jones, Chris\n" + "Ling, Mai\n" + "Swift, Geoffrey\n" + "Xiong, Fong\n" + "Zarnecki, Sabrina\n";
        assertEquals(peopleList.printList(),actual);
    }
}