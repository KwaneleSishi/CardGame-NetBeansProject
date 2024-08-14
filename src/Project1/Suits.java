/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project1;

/**
 *
 * @author Kwanele
 */
public enum Suits {
    CLUBS("Clubs"), HEARTS("Hearts"),SPADES("Spades"),Diamonds("Diamonds");
    private String suitText;
    //costructor
    private Suits(String suitText){
        this.suitText=suitText;
    }
    //public method to return suit name
    public String getSuit(){
        return suitText; 
    }    
    
}
 