package gameOfWarFinal;

public class Card {
//Fields
//value (contains a value from 2-14 representing cards 2-Ace)
//name (e.g. Ace of Diamonds, or Two of Hearts)

//describe (prints out information about a card)	
//}
//giving an integer for the suits below
public static final int Clubs = 0;
public static final int Diamonds = 1;
public static final int Hearts = 2;
public static final int Spades = 3;


//Assigning values to Jack, Queen, King, Ace since they do not have a number value to compare
public static final int Jack = 11;
public static final int Queen = 12;
public static final int King = 13;
public static final int Ace = 14;

private int cardName;		
private int cardValue;

/*
 * Below is the constructor for card class which gives the suit name and the value of the card in each suit
 * This area is for our Getters and Setters
 */

public Card(int cardName, int cardValue) {
	this.setCardName(cardName);
	this.setCardValue(cardValue);	
}

private void setCardName(int newCardName) {
	if (newCardName >= 0 && newCardName <= 3) {
		this.cardName = newCardName;
	} else {
		throw new IllegalArgumentException("Card needs to be between 0 and 3");
	}
}

private void setCardValue(int newCardValue) {	
	if (newCardValue < 2 || newCardValue > 14) {
		throw new IllegalArgumentException("Card value needs to be between 2 and 14!");
	}
	this.cardValue = newCardValue;
}

public int getcardName() {
	return cardName;
}

public int getValue() {
	return cardValue;
}

//Below if else statements gives the value of each card for comparison during the game

public String toString() {			
	String card = "";
		if (cardValue == 2) {
			card += "2";
		} else if (cardValue == 3) {
			card += "3";
		} else if (cardValue == 4) {
			card += "4";
		} else if (cardValue == 5) {
			card += "4";
		} else if (cardValue == 6) {
			card += "6";
		} else if (cardValue == 7) {
			card += "7";
		} else if (cardValue == 8) {
			card += "8";
		} else if (cardValue == 9) {
			card += "9";
		} else if (cardValue == 10) {
			card += "10";
		} else if (cardValue == Jack) {
			card += "Jack";
		} else if (cardValue == Queen) {
			card += "Queen";
		} else if (cardValue == King) {
			card += "King";
		} else if (cardValue == Ace) {
			card += "Ace";
		} else {
			card += cardValue;
		}
		
		card += " of ";
		
		if (cardName == Clubs) {
			card += "Clubs";
		} else if (cardName == Diamonds) {
			card += "Diamonds";
		} else if (cardName == Hearts) {
			card += "Hearts";
		} else if (cardName == Spades) {
			card += "Spades";
		}
	return card;
}
//Below prints out the information about each card as they are flipped between players
public void describe() {
	System.out.println(this.toString() + "\n");
	
}
	
}
