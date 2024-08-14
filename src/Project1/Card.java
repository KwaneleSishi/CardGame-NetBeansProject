/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author Kwanele
 */
public class Card {
    private Suits  suit;
    private Rank rank;
 
    
    //costructor method
    public Card(Rank rank, Suits suit){
        this.rank = rank;
        this.suit = suit;
       
    }
    //These are getter methods that allow you to 
    //retrieve the suit and rank of a Card object.
    public String getSuit(){
    
        return suit.getSuit(); 
    }
    public int getRank(){
        return rank.getRank();
    }
   //The string representation is created by concatenating the suit's string representation (from getSuit()) 
    //with the rank's string representation (from getRankString()) 
    //".png" to form the card's filename
    
    public String toString(){
        String str ="card";
         
        str +=  suit.getSuit()+ rank.getRankString()+".png";
       
        return str; 
    }
}
 