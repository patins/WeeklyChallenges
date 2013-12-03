
import java.util.Scanner;

public class BankChallenge {

    private static enum Unit {

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
        double amount = 0;
        for (Unit unit : Unit.values()) { // for each unit
            System.out.print(unit.getName() + ": "); // request a value
            int quantity = scanner.nextInt(); // read the value
            amount += quantity * unit.getValue(); // add this quantity to the total amount
        }
        int dollars = (int) (Math.floor(amount)); // round down the amount
        int cents = (int) ((amount - dollars) * 100d); // get the amount in cents
        System.out.println("total dollars: " + dollars);
        System.out.println("total cents: " + cents);
    }
}