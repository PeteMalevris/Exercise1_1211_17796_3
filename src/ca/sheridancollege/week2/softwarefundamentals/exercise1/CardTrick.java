/*
 * Modified by: Vincent Ursino (991608156)
 */

package ca.sheridancollege.week2.softwarefundamentals.exercise1;

import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */

public class CardTrick {
    
    public static void main(String[] args)
    {
        // Initialize the magicHand array and the Scanner
        Card[] magicHand = new Card[7];
        Scanner sc = new Scanner(System.in);
        
        // Generate random cards and add them to the magicHand array
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(Card.getRandomValueNumber());
            c.setSuit(Card.SUITS[Card.getRandomSuitNumber()]);
            
            magicHand[i] = c;
        }
        
        // Create the user's hard-coded card object
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit(Card.SUITS[3]);
        
        // Print the card to the user
        System.out.println("The card you picked was: " + luckyCard.getValue() + " of " + luckyCard.getSuit());
        
        // Search the magicHand array for a matching card
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        // Let the user know if their card was inside the magic hand or not
        if (found)
            System.out.println("Your card was inside the magic hand!");
        else
            System.out.println("Your card was not inside the magic hand...");
        
    }
    
}
