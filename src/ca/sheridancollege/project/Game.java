/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Parita
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author Sivagama 
 */
public class Game {
	String suit;
	int rank; 
	public Game(String suit, int rank){
		this.suit = suit; 
		this.rank = rank;
	}
        public String FirstName(){
            Name name = new Name(suit, rank);
            return name.getName();
        }
	public String getImageName()
        {
            if(rank==1)
            {
                return "A" +this.suit.charAt(0);
            }
            if(rank==11)
            {
                return "J"+this.suit.charAt(0);
            }
            if(rank==12)
            {
                return "Q"+this.suit.charAt(0);
            }
            if(rank==13)
            {
			return "K" + this.suit.charAt(0);
            }
            return ""+ rank +this.suit.charAt(0);
        }
       
	   //gets value of card
	public int getBlackjackValue(){
		if (rank > 10){
			return 10;}
		return rank;}
	public int getBlackjackValue1(){
		if (rank > 10){
			return 10;}
		return rank;}

    private static class Name {

        public Name() {
        }

        private Name(String suit, int rank) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getName() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}//end class
