/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class Human {

    //Define instance variables
    private String name;
    private int age;
    private char gender;
    
    //Constructor:
    //Used to create individual humans
    //Set up a human to use
    public Human(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public char getGender(){
        return gender;
    }
    public void setName(String name){
        this.name = name;
    }
    public void celebrateBirthday(){
        //Increase human age
        age++;
        //Wish them a happy birthday
        System.out.println("Happy birthday " + this.name);
    }
    public static void main(String[] args) {
        Human bob = new Human("bob", 20, 'm');
        System.out.println(bob.getName());
        System.out.println(bob.getAge());
        System.out.println(bob.getGender());
        
        Human alice = new Human("alice", 51, 'g');
        System.out.println(alice.getName());
        System.out.println(alice.getAge());
        System.out.println(alice.getGender());
        alice.celebrateBirthday();
        System.out.println(alice.getAge());
    }
}
