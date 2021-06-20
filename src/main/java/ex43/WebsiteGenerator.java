package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WebsiteGenerator {
    private String siteName;
    private String authorName;
    private boolean addFolderJS=false;
    private boolean addFolderCSS=false;


    public void scanInfo(){
        //ask and set site name and author name
        Scanner in=new Scanner(System.in);
        System.out.print("Site name: ");
        siteName=in.nextLine();
        System.out.print("Author: ");
        authorName=in.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        String strInput=in.nextLine();
        //ask for js and css folders check if yes or no and set boolean
        if(strInput.equalsIgnoreCase("Y")){
            addFolderJS=true;
        }
        System.out.print("Do you want a folder for CSS? ");
        strInput=in.nextLine();
        if(strInput.equalsIgnoreCase("Y")){
            addFolderCSS=true;
        }
    }

    public void generateWebsite() throws IOException {
        //create file and html file
        String fileName="website/"+siteName;
        File directory = new File(fileName);
        System.out.println("Created "+fileName);
        directory.mkdirs();

        File tmp=new File(fileName+"/index.html");
        tmp.createNewFile();
        System.out.println("Created "+fileName+"/index.html");


        //change author and title
        FileWriter bw = new FileWriter(tmp);
        bw.write("<head>\n" +
                " <title>"+siteName+"</title>\n" +
                " <meta name="+authorName+">\n" +
                "</head>");

        //check if to add folder js and add it if true
        if(addFolderJS){
            fileName="website/"+siteName+"/js/";
            directory=new File(fileName);
            directory.createNewFile();
            System.out.println("Created "+fileName);
        }

        //check if to add folder css and add it if true
        if(addFolderCSS){
            fileName="website/"+siteName+"/css/";
            directory=new File(fileName);
            directory.createNewFile();
            System.out.println("Created "+fileName);
        }
    }
}
