/*
 * Modified by: Vincent Ursino (991608156)
 */

package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author dancye
 */

public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13

   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
    // Method to generate a random value number between 1 and 13 (inclusive)
    public static int getRandomValueNumber() {
        return (int)(Math.random() * 13) + 1;
    }
    
    // Method to generate a random suit number between 0 and 3 (inclusive)
    public static int getRandomSuitNumber() {
        return (int)(Math.random() * 4);
    }
    
}
