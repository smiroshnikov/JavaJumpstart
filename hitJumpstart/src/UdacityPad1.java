/**
 * Created by miross1 on 12/19/2016.
 */
public class UdacityPad1 {
    public static void main(String[] args) {
        Car oldCar = new Car(15, 10);
        Car sleekCar = new Car(30, 50);

        System.out.printf("sleek CAR gas COST is %d\n", sleekCar.getGas_cost());
        System.out.printf("old CAR gas COST is %d\n", oldCar.getGas_cost());

        if (oldCar.getPurchasePrice() * oldCar.getGas_cost() < sleekCar.getPurchasePrice() * sleekCar.getGas_cost()) {
            System.out.println("Buy OLD CAR ! ");

            System.out.printf("%d gas cost multiplied by %d$ price ", oldCar.getGas_cost(), oldCar.getPurchasePrice() * oldCar.getGas_cost());
        } else {
            System.out.println("Buy SLEEK CAR ! its cheaper and has a sexy look  ");
            System.out.printf("I have calculated new car gas cost is %d$ and that is way less than old car gas cost %d$",
                    sleekCar.getGas_cost(), oldCar.getGas_cost());
        }

    }
}
