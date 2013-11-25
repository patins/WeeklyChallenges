
import java.util.Scanner;

public class MoneyChallenge {

    private static enum Unit {

        TENBILL(10d, "ten dollar bills"),
        FIVEBILL(5d, "five dollar bills"),
        ONEBILL(1d, "one dollar bills"),
        QUARTER(.25d, "quarters"),
        DIME(.10d, "dimes"),
        NICKEL(.05d, "nickels"),
        PENNY(.01d, "pennies");
        private final double value;
        private final String name;

        private Unit(double value, String name) {
            this.value = value;
            this.name = name;
        }

        public double getValue() {
            return value;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Money (in US dollars): ");
        double remainingMoney = scanner.nextDouble();
        scanner.close();
        for (Unit currentUnit : Unit.values()) { // for each unit execute this block
            int quantity = (int) Math.floor(remainingMoney / currentUnit.getValue()); // get how many times the current unit can go into the remaining amount of money
            System.out.println(quantity + " " + currentUnit.getName()); // display the quantity to the user
            remainingMoney -= quantity * currentUnit.getValue(); // subtract the money that was displayed from the remaining money
        }
    }
}