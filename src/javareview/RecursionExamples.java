/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class RecursionExamples {

    //Returns the nth fibinaci number
    //n = the nth number in the sequence
    public int fibLoop(int n){
        //Array to store sequence
        int[] numbers = new int[n+1];
        numbers[0] = 1;
        //Boundry condition fix
        if(n > 0){
            numbers[1] = 1;
        }
        //Building the sequence
        for(int i = 2; i < n+1; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];
        }
        //Returning the number
        return numbers[n];
    }

    //Calculate the nth number using the n = the nth number in the sequence
    public int fibR(int n){
        //Base case
        if(n == 0 || n == 1){
            return 1;
        }else{
            return fibR(n-1) + fibR(n-2);
        }
    }
    
    public static void main(String[] args) {
        
        RecursionExamples test = new RecursionExamples();
        int bound1 = test.fibLoop(0);
        System.out.println(bound1);
        int bound2 = test.fibLoop(1);
        System.out.println(bound2);
        int norm = test.fibLoop(6);
        System.out.println(norm);
        System.out.println("---------------------");
        int boundR1 = test.fibR(0);
        System.out.println(boundR1);
        int boundR2 = test.fibR(1);
        System.out.println(boundR2);
        int normR = test.fibR(6);
        System.out.println(normR);
    }
}
