/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Project1;

/**
 *
 * @author Kwanele
 */
public enum Rank {
    ACE(1,"A"),DEACE(2,"2"),THREE(3,"3"),FOUR(4,"4"),
    FIVE(5,"5"),SIX(6,"6"),SEVEN(7,"7"),EIGTH(8,"8"),
    NINE(9,"9"),TEN(10,"10"),JACK(11,"J"),QUEEN(12,"Q"),
    KING(13,"K");
    //private field
    private final int rankValue;
    private final String rankString;
    
    //constructor method
    private Rank(int rankValue, String rankString){
        this.rankValue=rankValue;
        this.rankString=rankString;
         }
    //public method
    public int getRank(){
        return rankValue;
    } 
   
    public String getRankString(){
        return rankString;
    }
           
}
