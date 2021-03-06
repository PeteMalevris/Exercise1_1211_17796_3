/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Nabila Ahmed
// Student #991 535 159
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(i);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[i]);
        }
        
        //insert code to ask the user for Card value and suit, create their card
        
        Card userCard = new Card();
        userCard.setValue(2);
        userCard.setSuit(Card.SUITS[2]);
        
         System.out.println("The card the user has entered is" + userCard.getValue() +" of " +userCard.getSuit());
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++){
            
            if (magicHand[i]== userCard)
        //Then report the result here
                System.out.println("Your card: " +userCard.getValue()+ " of " +userCard.getSuit()+ " is a winning card!");
            else 
                System.out.println("Your card: " +userCard.getValue()+ " of " +userCard.getSuit()+ "does not match, try again.");
                        
                }              
    }
    
}
