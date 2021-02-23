package Cards;

public class ClientWithBronzeCard extends Card {

    public ClientWithBronzeCard(String ownerInfo, double turnover,double purchaseValue) {
        super(ownerInfo, turnover,purchaseValue);
    }

    @Override
    public double getDiscountRate() {
        double discRate = 0;
        if(this.getTurnover() < 100){
            discRate = 0;
        }else if(this.getTurnover() >= 100 && this.getTurnover() <= 300){
            discRate = 1;
        }else {
            discRate = 2.5;
        }
        return discRate;
    }
}
