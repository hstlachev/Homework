import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 100 || number > 999) {
			System.out.println("Invalid number,you must enter a number with 3 digits");
		} else {
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			if (firstDigit == 0 || secondDigit == 0 || thirdDigit == 0) {
				System.out.println("Enter a number without 0");
			} else {
				if (number % firstDigit == 0 && number % secondDigit == 0 && number % thirdDigit == 0) {
					System.out.println("The number can be divided by it's digits");
				} else {
					System.out.println("The number cannot be divided by it's digits");
				}
			}
		}
	}
}