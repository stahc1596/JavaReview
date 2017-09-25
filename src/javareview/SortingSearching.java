/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class SortingSearching {

    public void swap(int[] array, int p1, int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
    
    public void selectionSort(int[] array){
        //Keep track of which position we are sorting
        for(int position = 0; position < array.length; position++){
            //Go through the rest looking for a smaller number
            for(int i = position + 1; i < array.length; i++){
                if(array[i] < array[position]){
                    swap(array, i, position);
                }
            }
        }
    }
    
    public void bubbleSort(int[] array){
        //Keep track of end
        int last = array.length;
        //Boolean to flag a swap
        boolean swap = true;
        //Continue if a swap has been made
        while(swap){
            swap = false;
            //look for swaps
            for(int i = 0; i < last; i++){
            
        }
        }
    }
    public static void main(String[] args) {
        SortingSearching test = new SortingSearching();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            //makes a random number
            numbers[i] = (int)(Math.random()*101);
        }
        System.out.println("BEFORE: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        test.selectionSort(numbers);
        System.out.println("AFTER: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
