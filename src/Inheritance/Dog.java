/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author stahc1596
 */
public class Dog extends Pet{

    public Dog(String name, int age, String breed, String colour){
        super(name, age, breed, colour);
    }
    
    @Override
    public void speak() {
        System.out.println("WOOF!");
    }
    
    public void howl(){
        System.out.println("HOWL!");
    }
    
    @Override
    public String toString(){
        String fromPet = super.toString();
        fromPet += "Type: Dog";
        return fromPet;
    }
    
}
