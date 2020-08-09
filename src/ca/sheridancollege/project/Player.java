/**
 * SYST 17796 Project Winter 2020 Base code.
 * Students can modify and extend to implement their game.
 * Parita
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * @author Sivagama
 */
public class Player {
        String suit;
	int rank; 
        public Player(String suit,int rank)
        {
            this.suit=suit;
            this.rank=rank;
        }
    	
	public String getFullName(){
		if (rank == 11){
			return "Jack of " + suit;
		}
		if (rank == 12){
			return "Queen of " + suit;
		}
		if (rank == 13)
			return "King of " + suit;
		
		return rank + " of " + suit;
	}
}