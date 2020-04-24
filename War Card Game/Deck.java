// github.com/DaniAngelov

package WarGame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Deck
{
	private ArrayList<Cards> deck;
	private Set<String> s = new HashSet<String>();
	private int counter = 0;
	
	
	Deck()
	{
		deck = new ArrayList<Cards>(52);
		for(int i = 0 ;i < 4;i++)
		{
			for(int j = 0;j < 13;j++)
			{
				this.deck.add(new Cards(j,i));
				s.add(deck.get(counter++).getCurrCard());
			}
		}
		
	}
	
	Deck(int elements)
	{
		deck = new ArrayList<Cards>();
	}
	
	Set<String> getSet()
	{
		return this.s;
	}
	
	
	ArrayList<Cards> getDeck()
	{
		return this.deck;
	}
	

	void print()
	{
		for(int i = 0 ;i < 52;i++)
		{
			if(i % 13 == 0)
				System.out.println("-------------NEXT SUIT--------------");
			System.out.println(this.deck.get(i).getCurrCard());
		}
	}
		
	
}
