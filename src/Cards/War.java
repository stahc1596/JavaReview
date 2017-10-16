/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

/**
 *
 * @author stahc1596
 */
public class War {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creat deck of cards
        Deck deck = new Deck();
        //Create some players
        Player P1 = new Player("Alice");
        Player P2 = new Player("Bob");
        
        //Shuffle and deal
        deck.shuffle();
        for(int i = 0; i < 52; i++){
            //Alternate card taking
            if(i % 2 == 0){
                P1.takeCard(deck.dealCard());
            }else{
                P2.takeCard(deck.dealCard());
            }
        }
        
        //Game time
        while(P1.getNumCards() > 0 && P2.getNumCards() > 0){
            
        }
    }
}
