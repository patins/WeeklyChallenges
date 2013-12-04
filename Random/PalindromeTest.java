import java.util.Scanner;

public class PalindromeTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Phrase: ");
		String phrase = scanner.nextLine();
		scanner.close();
		phrase = phrase.trim().replace(" ", "");
		boolean palindrome = phrase.equalsIgnoreCase(new StringBuilder(phrase).reverse().toString());
		System.out.println("'" + phrase + "' is " + (palindrome ? "" : "not ") + "a palindrome.");
	}
}
