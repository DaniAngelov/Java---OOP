// github.com/DaniAngelov

package WarGame;

public class Main {

	public static void main(String[] args)
	{
		Deck d = new Deck();
		Player p1 = new Player("gosho");
		Player p2 = new Player("misho");
		//d.print();
		
		
		while(!d.getSet().isEmpty())
		{
			p1.drawCard(d);
			if(p1.getCheck() != false)
			{
			p2.drawCard(d);
			while(p2.getCheck() == false)
			{
				p2.drawCard(d);
			}
			p1.cardPower(p2,d);
			}
		}
		
		
//		for(int i=0;i < p2.getWarPackage().size();i++)
//		{
//			System.out.println(p2.getWarPackage().get(i).getCurrCard());
//			System.out.println("============= IN THE PACKAGE ==============");
//		}
//		
		
		
		
		
		
		
		System.out.println("PLAYER 1: " + p1.getName() + " CARDS :");
		System.out.println("--------------------------");
		
		for(int i =0 ;i < p1.getDeckPlayer().getDeck().size();i++)
		{
			System.out.println(p1.getDeckPlayer().getDeck().get(i).getCurrCard());
		}
		
		System.out.println("PLAYER 2: " + p2.getName() + " CARDS :");
		System.out.println("--------------------------");
		
		for(int i =0 ;i < p2.getDeckPlayer().getDeck().size();i++)
		{
			System.out.println(p2.getDeckPlayer().getDeck().get(i).getCurrCard());
		}
		System.out.println("--------------------------------");
		int p1Size = p1.getDeckPlayer().getDeck().size();
		int p2Size = p2.getDeckPlayer().getDeck().size();
		System.out.println(p1.getName() + " Deck Size has " + p1Size + " cards !");
		System.out.println("--------------------------------");
		System.out.println(p2.getName() + " Deck Size has " + p2Size + " cards !");
		System.out.println("--------------------------------");
		if(p1Size > p2Size)
			System.out.println( p1.getName() + " IS THE WINNER !!");
		else if(p1Size < p2Size)
			System.out.println( p2.getName() + " IS THE WINNER !!");
		else
			System.out.println(" THE GAME IS A TIE ! WELL PLAYED !");
			
		
	
		

		
		
		

	}

}
