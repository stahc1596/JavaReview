/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards;

/**
 * A class to represent a single playing card
 * @author stahc1596
 */
public class Card {

    //suit constants
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int SPADES = 2;
    public static final int HEARTS = 3;
    
    //Instance varaibles
    private int rank;
    private int suit;
    
    //constructor:
    /**
     * The Constructor for a single playing card
     * @param rank the rank of the card (1-13)
     * @param suit the suit of the card
     */
    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }
    /**
     * get the suit of the card
     * @return suit of the card
     */
    public int getSuit(){
        return this.suit;
    }
    /**
     * rank of the card
     * @return the rank of the card
     */
    public int getRank(){
        return this.rank;
    }
    /**
     * Determines if this card is bigger than another card
     * @param c the card to check against
     * @return true if the card is bigger than card c
     */
    public boolean isBigger(Card c){
        if(this.rank > c.rank){
            return true;
        }else{
            return false;
        }
    }
}
