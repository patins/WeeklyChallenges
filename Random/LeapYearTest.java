import java.util.Scanner;

public class LeapYearTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Year: ");
		int year = scanner.nextInt();
		scanner.close();
		if(year < 1582) {
			System.out.println(year + " is not in the gregorian calander.");
			System.exit(0);
		}
		boolean leap = (year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0);
		System.out.println(year + " is " + (leap ? "" : "not ") + "a leap year.");
		
	}
}
