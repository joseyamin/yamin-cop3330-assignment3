package ex43;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */
/*
Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
 */

import java.io.IOException;

public class Sol43 {

    public static void main(String[] args) throws IOException {
        //read in info and generate website with websiteGenerator class
        WebsiteGenerator websiteGenerator=new WebsiteGenerator();
        websiteGenerator.scanInfo();
        websiteGenerator.generateWebsite();
    }


}
