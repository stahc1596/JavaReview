/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author stahc1596
 */
public class MyLinkList {

    private IntNode head;
    private int numItems;
    
    public MyLinkList(){
        head = null;
        numItems = 0;
    }
    
    public void add(int num){
        //Start at beginning of list
        IntNode node = head;
        //See if you're at the start
        if(node == null){
            IntNode temp = new IntNode(num);
            head = temp;
        }else{
        //Travel to the end
            while(node.getNext() != null){
                node = node.getNext();
            }
            //node is the last node in the list
            IntNode temp = new IntNode(num);
            //Insert into list
            node.setNext(temp);
        }
        
        numItems++;
    }
    
    public void add(int pos, int num){
        //At the front
        if(pos == 0){
            IntNode temp = new IntNode(num);
            //the new node starts and points to the starting node
            temp.setNext(head);
            head = temp;
            //adding at the end os the list
        }else if(pos == numItems){
            add(num);
            //anywhere else
        }else{
            //Start at the beginning
            IntNode node = head;
            //Move to the node before the insert
            for(int i = 0; i < pos - 1; i++){
                node = node.getNext();
            }
            //At the node just before we want to insert
            IntNode temp = new IntNode(num);
            //Create the after link first
            temp.setNext(node.getNext());
            node.setNext(temp);
        }
        numItems++;
    }
    
    public int size(){
        return numItems;
    }
    
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    public int get(int pos){
        IntNode node = head;
        //Move the number of times
        for(int i = 0; i < pos; i++){
            node = node.getNext();
        }
        return node.getNum();
    }
    
    public void remove(int pos){
        //If removing from start
        if(pos == 0){
            head = head.getNext();
        }else if(pos == numItems - 1){
            //Removing from the end
            IntNode node = head;
            //Moving to the second last item
            for(int i = 0; i < numItems; i++){
                node = node.getNext();
            }
            //Sever the link
            node.setNext(null);
        }else{
            IntNode node = head;
            //Move to the spot just before
            for(int i = 0; i < pos - 1; i++){
                node = node.getNext();
            }
            //The node to remove
            IntNode toRemove = node.getNext();
            //It's next node
            IntNode next = toRemove.getNext();
            //Set all links
            node.setNext(next);
            toRemove.setNext(null);
        }
        numItems--;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.add(2);
        list.add(-5);
        list.add(0, 13);
        list.remove(1);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
