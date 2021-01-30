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
        
        // Prompt the user to pick a card
        System.out.print("Pick a card value between 1 and 13 (inclusive): ");
        int value = sc.nextInt();
        
        System.out.print("Pick a card suit between 0 and 3 (inclusive): ");
        int suit = sc.nextInt();
        
        // Print the card to the user
        System.out.println("The card you picked was: " + value + " of " + Card.SUITS[suit]);
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
