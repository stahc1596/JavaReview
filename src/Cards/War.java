/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

import java.util.ArrayList;

/**
 *
 * @author stahc1596
 */
public class War {

    
    public static int winner(Card P1Card, Card P2Card){
        if(P1Card.getRank() == P2Card.getRank()){
            System.out.println("WAR");
                return 0;
            }
            //Check is ace played
            else if(P1Card.getRank() == 1 || (P1Card.isBigger(P2Card) && P2Card.getRank() != 1)){
                return 1;
            }
            //Player 2 wins
            else{
                return 2;
            }
    }
    
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
            //Player one's card
            Card P1Card = P1.playCard();
            System.out.println("Player 1 plays " + P1Card);
            //Player two's card
            Card P2Card = P2.playCard();
            System.out.println("Player 2 plays " + P2Card);
            
            int winner = winner(P1Card, P2Card);
            //Did a war happen
            if(winner == 0){
                //Make sure players have enough cards
                if(P1.getNumCards() < 4){
                    System.out.println("Player 1 ran out of cards!");
                    //P1 loses
                    winner = 2;
                    //Get rid of cards
                    while(P1.getNumCards() > 0){
                        P1.playCard();
                    }
                    break;
                }else if(P2.getNumCards() < 4){
                    System.out.println("Player 2 ran out of cards!");
                    winner = 1;
                    while(P2.getNumCards() > 0){
                        P2.playCard();
                    }
                    break;
                }
                //War code
                ArrayList<Card> pile = new ArrayList<>();
                //Keep playing till winner
                while(winner == 0){
                    pile.add(P1Card);
                    pile.add(P2Card);
                    Card[] P1Cards = P1.get3Cards();
                    Card[] P2Cards = P2.get3Cards();
                    for(int i = 0; i < 3; i++){
                        pile.add(P1Cards[i]);
                        pile.add(P2Cards[i]);
                    }
                    //Draw new card
                    P1Card = P1.playCard();
                    P2Card = P2.playCard();
                    System.out.println("Player 1 plays " + P1Card);
                    System.out.println("Player 2 plays " + P2Card);
                    winner = winner(P1Card, P2Card);
                }
                //War is over
                //Add pile to victor
                if(winner == 1){
                    //For each card in the file
                    for(Card aCard: pile){
                        P1.takeCard(aCard);
                    }
                }else{
                    for(Card aCard: pile){
                        P2.takeCard(aCard);
                    }
                }
            }
            //Check is ace played
            if(winner == 1){
                System.out.println("Player 1 wins the round");
                P1.takeCard(P2Card);
                P1.takeCard(P1Card);
            }
            //Player 2 wins
            else{
                System.out.println("Player 2 wins the round");
                P2.takeCard(P2Card);
                P2.takeCard(P1Card);
            }
            //Space to seperate rounds
            System.out.println();
        }
        
        //Player 1 wins
        if(P1.getNumCards() > 0){
            System.out.println("Player 1 wins");
        //player 2 wins
        }else{
            System.out.println("Player 2 wins");
        }
    }
}
