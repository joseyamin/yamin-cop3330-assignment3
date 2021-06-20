package ex45;

import junit.framework.TestCase;

public class FileEditorTest extends TestCase {

    public void testGetFileStr() {
        FileEditor fileEditor=new FileEditor();
        fileEditor.fileStr="One should never utilize the word \"utilize\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "utilizes an IDE to write her Java programs\".";
        String expected="One should never use the word \"use\" in writing. Use \"use\" instead.\n" +
                "For example, \"She uses an IDE to write her Java programs\" instead of \"She\n" +
                "uses an IDE to write her Java programs\".";
        fileEditor.editFileStr();
        String actual=fileEditor.getFileStr();
        assertEquals(expected,actual);
    }
}