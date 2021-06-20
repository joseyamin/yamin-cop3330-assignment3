package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileEditor {
    public String fileStr;

    public void storeInputStr() throws FileNotFoundException {
        //loop through file scanning every line adding it to fileStr

        File ifp=new File("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\main\\java\\ex45\\exercise45_input.txt");

        Scanner in = new Scanner(ifp);
        fileStr="";
        while(in.hasNextLine()) {
            fileStr=fileStr+in.nextLine()+"\n";
        }
    }

    public void editFileStr(){
        //use replace function to edit it
        fileStr=fileStr.replaceAll("utilize","use");
    }

    public String getFileStr(){
        //return filestr
        return fileStr;
    }


}
