
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
        for (Unit unit : Unit.values()) {
            System.out.print(unit.getName() + ": ");
            int quantity = scanner.nextInt();
            amount += quantity * unit.getValue();
        }
        int dollars = (int) (Math.floor(amount));
        int cents = (int) ((amount - dollars) * 100d);
        System.out.println("total dollars: " + dollars);
        System.out.println("total cents: " + cents);
    }
}