/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author stahc1596
 */
public class TextFileExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a blank file reader
        FileReader file = null;
        try{
            //To fix
            URL url = ClassLoader.getSystemClassLoader().getResource("input.txt");
            
            //Creating the file reader
            file = new FileReader("input.txt");
        }catch(Exception e){
            //Handle the error
            //Print out the lovely red errors
            e.printStackTrace();
            //Stop program
            System.exit(0);
        }
        
        Scanner in = new Scanner(file);
        //Get the first number back
        int numAddresses = in.nextInt();
        //Move to next line
        in.nextLine();
        
        Contact[] contacts = new Contact[numAddresses];
        //Go through the file
        for(int i = 0; i < numAddresses; i++){
            String name = in.next();
            String phone = in.next();
            String email = in.nextLine().trim();
            //Create the contact
            Contact c = new Contact(name);
            c.setEmail(email);
            c.setNumber(phone);
            //add contact to list
            contacts[i] = c;
        }for(int i = 0; i < contacts.length; i++){
            System.out.println(contacts[i]);
        }
    }
}
