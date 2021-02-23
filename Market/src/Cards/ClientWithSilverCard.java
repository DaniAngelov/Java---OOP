package Cards;

public class ClientWithSilverCard extends Card{


    public ClientWithSilverCard(String ownerInfo, double turnover, double purchaseValue) {
        super(ownerInfo, turnover, purchaseValue);
    }

    @Override
    public double getDiscountRate() {
        double discRate = 2;
        if(this.getTurnover() > 300){
            discRate = 3.5;
        }
        return discRate;
    }
}
