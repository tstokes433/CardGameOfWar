package gameOfWarFinal;


public class App {
	
public static void main(String[] args) {
		
	     
		//  a) Instantiate a deck and two players. call the shuffle method on the deck;
			   
		Deck deck = new Deck(); //creates a new deck to start the game
		deck.shuffle(); //should shuffle the entire deck at random
		Player playerOne = new Player("Adam");
		Player playerTwo = new Player("Ben");
			    

		/*
		 *  b) Using a traditional for loop, iterate 52 times calling the Draw method on the other player
		 *  each iteration using the Deck you instantiated.
		 */

			    for(int i = 1; i <= 26; i++){ 		//iterates 26 cards to each player's hand
					playerOne.hand.add(deck.draw()); 
					playerTwo.hand.add(deck.draw());
				}    
			    
			    playerOne.describe();
			    playerTwo.describe();
			    
		// c) Using a traditional for loop, iterate 26 times and call the flip method for each player.	    
			    
			    for (int i = 0; i < 26; i++) {
			      Card playerOneCard = playerOne.flip();  //flip and play first/next card for playerOne
			      Card playerTwoCard = playerTwo.flip();  //flip and play first/next card for playerTwo
			      	if (playerOneCard.getValue() > playerTwoCard.getValue()) {
			      		playerOne.incrementScore();
			      	}else if (playerOneCard.getValue() < playerTwoCard.getValue()) {
			      		playerTwo.incrementScore();
			      	}else {
			      	  System.out.println();
			      	}
			    
			    }
			    
		/*
		 *  d) Compare the value of each card returned by the two player's flip method. Call the
		 *         incrementScore method on the player whose card has the higher value.
		 *  e) After the loop, compare the final score from each player.
		 *  f) Print the final score of each player, and either "Player 1", "Player 2", or "Draw"
		 *         depending on which score is higher or if they are both the same.  
		 */
  
			    if (playerOne.score > playerTwo.score) {
				      System.out.println("Adam" + " Wins!!!");
				      System.out.println("With a score of " + playerOne.score + " to " + playerTwo.score);
				    } else if (playerTwo.score > playerOne.score) {
				      System.out.println("Ben" + " Wins!!!");
				      System.out.println("With a score of " + playerTwo.score + " to " + playerOne.score);
				    } else  {  
				      System.out.println("Draw!!");
				    }    
	    
		}
			 
	}	


