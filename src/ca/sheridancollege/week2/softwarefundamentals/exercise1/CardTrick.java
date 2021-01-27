/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
import java.util.Scanner;


public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        int max = 13;
        int min = 1;
        int suitMax = 3;
        int suitMin = 0;
        int suit, value;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            double random_num = Math.random() * (max - min + 1) + min;                  // generate number between min=1 and max=13
            double random_suit = Math.random() * (suitMax - suitMin + 1) + suitMin;     // generate number between min=0 and max=3
            magicHand[i] = c;
            c.setValue((int)random_num);
            c.setSuit(Card.SUITS[(int)random_suit]);
            
            //System.out.println("Number = " + (int)random_num);                          //TODO delete - print genarated card value
            //System.out.println("Suit = " + (int)random_suit);                           //TODO delete - print generated card suit
        }
        
        //insert code to ask the user for Card value and suit, create their card
        Card user_card = new Card();
        
        System.out.print("Pick a card value from 1 to 13: ");
        value = input.nextInt();
        
        System.out.println("Pick a Suit (0-3):\n"
                + "[0]Heats\n"
                + "[1]Diamonds\n"
                + "[2]Spades\n"
                + "[3]Clubs");
        System.out.print("Suit: ");
        suit = input.nextInt();
        
        user_card.setValue(value);
        user_card.setSuit(user_card.SUITS[suit]);
        
        //add print user card
        
        // and search magicHand here
        boolean found = false;
        for (int j = 0; j<magicHand.length; j++)
        {
            if(user_card.getValue() == magicHand[j].getValue() && user_card.getSuit() == magicHand[j].getSuit())
            {
                found = true;
            }
        }
        
        //Then report the result here
        if (found == true)
        {
            System.out.println("Congratulations!!! You picked one of the magic cards!!!");
        }
        else
        {
            System.out.println("Sorry. You did not pick a magic card.");
        }
    }
    
}
