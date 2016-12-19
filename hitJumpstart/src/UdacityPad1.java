/**
 * Created by miross1 on 12/19/2016.
 */
public class UdacityPad1 {
    public static void main(String[] args) {
        Car oldCar = new Car(15000, 10);
        Car sleekCar = new Car(30000, 50);
        if (oldCar.getPurchasePrice() + oldCar.getGas_cost() < sleekCar.getPurchasePrice() + sleekCar.getGas_cost()) {
            System.out.println("Buy OLD CAR ! ");
        } else {
            System.out.println("Buy SLEEK CAR ! its cheaper and has a sexy look  ");
        }
        System.out.printf("The whole package for sleek one, including car price and 50,000 miles driving will cost ya %d\n",
                sleekCar.getGas_cost() + sleekCar.getPurchasePrice());
        System.out.printf("For comparison buying an old car and driving 50,000 miles will cost ya %d\n",
                oldCar.getGas_cost() + oldCar.getPurchasePrice());
    }

}

