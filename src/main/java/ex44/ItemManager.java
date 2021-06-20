package ex44;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.ArrayList;

public class ItemManager {
    private ArrayList<Item> itemArrayList=new ArrayList<Item>();

    public void readItems() throws FileNotFoundException {
        //get the json file and the json product array
        File input=new File("C:\\Users\\josem\\IdeaProjects\\yamin-cop3330-assignment3\\src\\main\\java\\ex44\\exercise44_input.json");
        JsonElement fileElement=JsonParser.parseReader(new FileReader(input));
        JsonObject fileObject=fileElement.getAsJsonObject();
        JsonArray jArray=fileObject.get("products").getAsJsonArray();
        //loop through the elements in the json array
        //store each piece of info into an item and add it to the list
        for(JsonElement productElement: jArray){
            Item newItem=new Item();
            JsonObject productJsonObject=productElement.getAsJsonObject();
            newItem.name=productJsonObject.get("name").getAsString();
            newItem.price=productJsonObject.get("price").getAsDouble();
            newItem.quantity=productJsonObject.get("quantity").getAsInt();
            itemArrayList.add(newItem);
        }
    }

    //return true if found
    public boolean findItem(String name){
        //loop and find item
        //if found print info and return true
        //return false at end if item is never found
        for(Item temp:itemArrayList){
            if(temp.name.equalsIgnoreCase(name)){
                System.out.println("Name: "+ temp.name);
                System.out.println("Price: "+ temp.price);
                System.out.println("Quantity: "+ temp.quantity);
                return true;
            }
        }
        return false;
    }

}
