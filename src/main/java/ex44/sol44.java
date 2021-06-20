package ex44;
/*
 *  UCF COP3502 Spring 2021 Assignment 2 Solution
 *  Copyright 2021 Jose Yamin
 */

import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Pulling data from a file into a complex data structure makes parsing much simpler. Many programming languages support the JSON format, a popular way of representing data.

Create a program that takes a product name as input and retrieves the current price and quantity for that product. The product data is in a data file in the JSON format  and looks like this (you will create this file as `exercise44_input.json`):
 */
public class sol44 {
    public static void main(String[] args) throws FileNotFoundException {
        ItemManager itemManager=new ItemManager();
        //read in items
        itemManager.readItems();

        //ask for item, if found it will return true, loop question until true is returned
        Scanner in=new Scanner(System.in);
        System.out.print("What is the product name? ");
        while(!itemManager.findItem(in.nextLine())){
            System.out.println("Sorry, that product was not found in our inventory.");
            System.out.print("What is the product name? ");
        }

    }
}
