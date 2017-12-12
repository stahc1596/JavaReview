/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author stahc1596
 */
public class TestAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 3, "Boston Terrier", "Black and White");
        Cat whiskers = new Cat("Whiskers", 2, "Tabby", "Brown");
        Dog cuddles = new Dog("Cuddles", 8, "Rottweiler", "Black");
        
        fido.speak();
        whiskers.speak();
        
        System.out.println(fido);
        
        fido.howl();
        
        Pet[] p = new Pet[3];
        p[0] = fido;
        p[1] = whiskers;
        p[2] = cuddles;
        
        for(int i = 0; i < 3; i++){
            System.out.println(p[i]);
            if(p[i] instanceof Dog){
                Dog tempDog = (Dog)p[i];
                tempDog.howl();
            }else{
                p[i].speak();
            }
        }
    }
}
