/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;
import java.util.*;

/**
 *
 * @author Kwanele
 */


public class Deck {
    private ArrayList<Card> cards;
    private Random random = new Random();

    public Deck() {
        cards = new ArrayList<>();
        populate();
    }
    //This method fills the cards collection with a standard deck of 52 Cards.
    public void populate() {
        cards.clear(); // Clear existing cards if any
        for (Suits suit : Suits.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(rank, suit);
                cards.add(card);
            }
        }
    }

    private Card drawRandomCard() {
        int size = cards.size();
        if (size > 0) {
            int pick = random.nextInt(size);
            return cards.remove(pick);
        }
        return null; // Deck is empty
    }
//These methods call the drawRandomCard() method to obtain a random card from the deck and return it
    public Card getPlayerCard() {
        return drawRandomCard();
    }

    public Card getComputerCard() {
        return drawRandomCard();
    }
}

    
    
