/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class Methods {
    
    public void helloWorld(){
        System.out.println("Hello World");
    }
    public void helloWorld(String name){
        System.out.println("Hello " + name);
    }
    public int sumRange(int start, int end){
        int sum = 0;
        for(int i = start; i <= end; i++){
            sum = sum + i;
        }
        return sum;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create an object to run methods
        Methods test = new Methods();
        test.helloWorld();
        test.helloWorld("Steve");
        int total = test.sumRange(5, 10);
        System.out.println(total);
    }
}
