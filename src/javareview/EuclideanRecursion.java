/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class EuclideanRecursion {

    public int gcd(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(a%b == 0){
            return b;
        }else{
            //Find new values for a and b
            int r = a%b;
            return gcd(b, r);
        }
    }
    public static void main(String[] args) {
        EuclideanRecursion test = new EuclideanRecursion();
        int gcd = test.gcd(1378, 24);
        System.out.println(gcd);
    }
}
