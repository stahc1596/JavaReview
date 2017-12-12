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

    private int lives;
    
    public Cat(String name, int age, String breed, String colour){
        super(name, age, breed, colour);
        this.lives = 9;
    }
    
    @Override
    public void speak() {
        System.out.println("MEOW!");
    }
    
    @Override
    public String toString(){
        String fromPet = super.toString();
        fromPet += "Lives: " + this.lives;
        fromPet += "Type: Cat";
        return fromPet;
    }
}
