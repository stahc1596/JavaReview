/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class ArrayStack {

    //Keep track of how many items
    private int numitems;
    private int[] stack;
    
    public ArrayStack(){
        stack = new int[10];
        numitems = 0;
    }
    
    public void push(int item){
        if(numitems < stack.length){
            //Put the item on the stack
            stack[numitems] = item;
            numitems++;
        }else{
            //Make more room
            int[] temp = new int[stack.length*2];
            //Copy items over
            for(int i = 0; i < stack.length; i++){
                temp[i] = stack[i];
            }
            //Stack equals new array
            stack = temp;
            //Add in new item
            stack[numitems] = item;
            numitems++;
        }
    }
    
    public int pop(){
        //Get the item on top of the stack
        int item = stack[numitems - 1];
        //One less item
        numitems--;
        //Give back item
        return item;
    }
    
    public int size(){
        return numitems;
    }
    
    public int peek(){
        return stack[numitems - 1];
    }
    
    public boolean isEmpty(){
        return numitems == 0;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create an empty stack
        ArrayStack stack = new ArrayStack();
        System.out.println("Empty " + stack.isEmpty());
        stack.push(12);
        System.out.println("Empty " + stack.isEmpty());
        System.out.println("Peek " + stack.peek());
        System.out.println("Size " + stack.size());
        int item = stack.pop();
        System.out.println("Popped item " + item);
        System.out.println("Empty " + stack.isEmpty());
        
        //test adding lots of numbers
        for(int i = 0; i < 100; i++){
            stack.push(i);
        }
        System.out.println("Size " + stack.size());
        System.out.println("Peek " + stack.peek());
        stack.pop();
        System.out.println("Peek " + stack.peek());
    }
}
