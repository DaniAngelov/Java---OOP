// github.com/DaniAngelov

public class Main {

	
	public static void main(String[] args)
	{
		GSM s1 = new GSM();
		GSM s2 = new GSM();
		
		s1.model = "g12";
		s2.model = "p13";
		s1.insertSimCard("0881995981");
		s2.insertSimCard("0894510200");
		
		s1.call(s2,30);
		
		s1.printInfoForTheLastOutgoingCall();
		s2.printInfoForTheLastIncomingCall();
		
		
		
	}
}
