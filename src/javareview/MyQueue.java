/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class MyQueue {

    private int numItems;
    private IntNode head;
    private IntNode tail;
    
    public MyQueue(){
        numItems = 0;
        head = null;
        tail = null;
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    public int peek(){
        return head.getNum();
    }
    
    public void enqueue(int item){
        if(numItems == 0){
            IntNode temp = new IntNode(item);
            head = temp;
            tail = temp;
        }else{
            IntNode temp = new IntNode(item);
            tail.setNext(temp);
            tail = temp;
        }
        numItems++;
    }
    
    public int dequeue(){
        //Get the item
        if(numItems == 1){
            //Remove it from the queue
            int item = head.getNum();
            head = null;
            tail = null;
            numItems--;
            //Return the item
            return item;
        }else{
            //Get the item
            int item = head.getNum();
            //sever the link
            IntNode old = head;
            head = head.getNext();
            old.setNext(null);
            //Return the item
            numItems--;
            return item;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(-6);
        System.out.println("Size " + q.size());
        System.out.println("Front " + q.peek());
        int item = q.dequeue();
        System.out.println("Front " + q.peek());
        item = q.dequeue();
        System.out.println("Front " + q.peek());
        item = q.dequeue();
        System.out.println("Empty " + q.isEmpty());
    }
}
