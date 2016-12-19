/**
 * Created by miross1 on 12/19/2016.
 */
public class Car {
    private static final int MILES_DRIVEN = 50000;
    private static final int PRICE_PER_GALLON = 4;
    private int purchasePrice;
    private int mpg = 1;

    public Car(int purchasePrice, int mpg) {
        this.purchasePrice = purchasePrice;
        this.mpg = mpg;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getGas_cost() {
        int gas_cost;
        gas_cost = (MILES_DRIVEN / mpg) * PRICE_PER_GALLON;
        return gas_cost;
    }


}
