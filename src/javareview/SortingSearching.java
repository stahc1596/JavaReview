/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

import java.util.Arrays;

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
            for(int i = 0; i < last - 1; i++){
                //Find a bigger value?
                if(array[i] > array[i+1]){
                    //swap
                    swap(array, i, i+1);
                    //set flag to true
                    swap = true;
                }
            }
            //Move the last position tracker
            last--;
        }
    }
    
    public void insertionSort(int[] array){
        //Start going through the array
        for(int i = 0; i < array.length - 1; i++){
            //Store position
            int position = i;
            //Check values beside each other
            while(position >= 0 && array[position] > array[position + 1]){
                //if out of place, start swaping down
                //until correct position is reached
                swap(array, position, position + 1);
                position--;
            }
        }
    }
    public void mergeSort(int[] array){
        //If we are 1 item, done sorting
        if(array.length <= 1){
            return;
        }
        //divide into two arrays
        int split = array.length / 2;
        //create two arrays
        int[] front = Arrays.copyOfRange(array, 0, split);
        int[] back = Arrays.copyOfRange(array, split, array.length);
        
        //Recursively sort
        mergeSort(front);
        mergeSort(back);
        
        //Put numbers in correct spot
        //Keeping track of where we are
        int fSpot = 0;
        int bSpot = 0;
        for(int i = 0; i < array.length; i++){
            //No more items in front array
            if(fSpot == front.length){
                array[i] = back[bSpot];
                bSpot++;
            }else if(bSpot == back.length){
                array[i] = front[fSpot];
                fSpot++;
            }else if(front[fSpot] < back[bSpot]){
                array[i] = front[fSpot];
                fSpot++;
            }else{
                array[i] = back[bSpot];
                bSpot++;
            }
        }
    }
    
    public int sequentialSearch(int[] array, int number){
        for(int i = 0; i < array.length; i ++){
            if(array[i] == number){
                return 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        SortingSearching test = new SortingSearching();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            //makes a random number
            numbers[i] = (int)(Math.random()*101);
        }
        //Before
        System.out.println("BEFORE: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Type of sort
        test.mergeSort(numbers);
        //After
        System.out.println("AFTER: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
