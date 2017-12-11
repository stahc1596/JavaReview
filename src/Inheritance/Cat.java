/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author stahc1596
 */
public class Cat extends Pet{

    public Cat(String name, int age, String breed, String colour){
        super(name, age, breed, colour);
    }
    
    @Override
    public void speak() {
        System.out.println("MEOW!");
    }
    
}
