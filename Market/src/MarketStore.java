import Cards.Card;
import Cards.ClientWithBronzeCard;
import Cards.ClientWithGoldCard;
import Cards.ClientWithSilverCard;

import java.util.ArrayList;
import java.util.List;

public class MarketStore {
    public static void main(String[] args) {
        Card clientWithBronzeCard = new ClientWithBronzeCard("info",0,150);
        Card clientWithSilverCard = new ClientWithSilverCard("info",600,850);
        Card clientWithGoldCard = new ClientWithGoldCard("info",1500,1300);

        List<Card> clients = new ArrayList<>();
        clients.add(clientWithBronzeCard);
        clients.add(clientWithSilverCard);
        clients.add(clientWithGoldCard);

        for(Card c : clients){
            try{
                c.printInfo();
            }catch (NullPointerException e){
                System.out.println("Please enter a valid client!");
            }

        }
    }
}
