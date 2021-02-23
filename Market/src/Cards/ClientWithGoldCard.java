package Cards;

public class ClientWithGoldCard extends Card{


    public ClientWithGoldCard(String ownerInfo, double turnover, double purchaseValue) {
        super(ownerInfo, turnover, purchaseValue);
    }

    @Override
    public double getDiscountRate() {
        double discRate = 2;
        double numbForDiscountCalculation = this.getTurnover() / 100;
        if(numbForDiscountCalculation >= 0 && numbForDiscountCalculation < 8){
            discRate += numbForDiscountCalculation;
        }else{
            discRate = 10;
        }

        return discRate;
    }
}
