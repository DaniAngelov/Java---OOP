// github.com/DaniAngelov

package WarGame;

public class Cards
{
	
	private int rank;
	private int suit;
	private String currCard;
	private String[] ranks = {"Two of", "Three of", "Four of", "Five of","Six of","Seven of",
			"Eight of", "Nine of", "Ten of", "Jack of", "Queen of", "King of", "Ace of"};
	private String[] suits = {" Clubs", " Diamonds", " Hearts", " Spades"};
	
	
	Cards(int rank,int suit)
	{
		this.rank = rank;
		this.suit = suit;
		this.currCard = this.ranks[rank] + this.suits[suit];
	
	}
	
	String getCurrCard()
	{
		return this.currCard;
	}
	
	String getRank(int index)
	{
		return this.ranks[index];
	}
	
	
	String getSuit(int index)
	{
		return this.suits[index];
	}
}
