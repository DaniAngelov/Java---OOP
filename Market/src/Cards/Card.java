package Cards;

public abstract class Card {
    private String ownerInfo;
    private double turnover;
    private double initialDiscountRate;
    private double purchaseValue;

    public Card(String ownerInfo, double turnover,double purchaseValue){
        this.ownerInfo = ownerInfo;
        if(turnover > 0){
            this.turnover = turnover;
        }
        this.initialDiscountRate = getDiscountRate();
        this.purchaseValue = purchaseValue;
    }

    public double getTurnover() {
        return turnover;
    }

    public void printInfo(){
        double discount = this.purchaseValue * (this.initialDiscountRate / 100);
        double total = this.purchaseValue - discount;
        System.out.println("================= Client =================");
        System.out.printf("Discount: $%.2f \n",this.purchaseValue);
        System.out.println("Discount rate: " + this.initialDiscountRate +"%");
        System.out.printf("Discount: $%.2f \n",discount);
        System.out.printf("Total: $%.2f \n",total);
    }

    public abstract double getDiscountRate();
}
