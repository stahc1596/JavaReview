/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

import java.util.Scanner;
/**
 *
 * @author stahc1596
 */
public class JavaReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialize variables
        //Type name [ = value ]
        int age = 10;
        double length = 25.73;
        //Math ops
        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulus (remainder after division)
        age = age + 10;
        length = length * 2;
        age++; //adds 1
        age--; //subtracts 1
        
        //conditions
        if(length > 100){
            System.out.println("Length is greater than 100");
        }else if(length > 50 && length <= 100){
            System.out.println("Length is between 50 and 100");
        }else{
            System.out.println("Length is 50 or lower");
        }
        //&& = and
        //|| = or
        //while loops
        int count = 0;
        while(count < 10){
            //increase count and print
            count++;
            System.out.println(count);
        }for(int i = 0; i < 10; i++){
            System.out.println("i: " + i);
        }
        
        //Arrays
        String[] words = new String[5];
        words[0] = "Cat";
        
        //input
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < words.length; i++){
            System.out.println("Enter a word");
            words[i] = in.nextLine();
            //next = word, nextline = sentence
            if(words[i].equals("EXIT")){
                break;
            }
            
            int wordLength = words[i].length();
        
        }
    }
}
