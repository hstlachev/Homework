import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		for (int number = 100; number < 1000; number++) {
			boolean isPrime = true;
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			if (isPrime && (firstDigit != secondDigit) && (firstDigit != thirdDigit) && (secondDigit != thirdDigit)) {
				System.out.println(number);
			}

		}

	}
}
