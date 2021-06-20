package ex44;

import junit.framework.TestCase;

import java.io.FileNotFoundException;

public class ItemManagerTest extends TestCase {

    public void testFindItemTestFound() throws FileNotFoundException {
        ItemManager itemManager=new ItemManager();
        itemManager.readItems();
        boolean expected=true;
        boolean actual=itemManager.findItem("Thing");
        assertEquals(expected,actual);
    }

    public void testFindItemTestNotFound() throws FileNotFoundException {
        ItemManager itemManager=new ItemManager();
        itemManager.readItems();
        boolean expected=false;
        boolean actual=itemManager.findItem("iPad");
        assertEquals(expected,actual);
    }
}