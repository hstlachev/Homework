import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int numberOfDigits = 0;
		int temp = number;
		do {
			temp /= 10;
			numberOfDigits++;
		} while (temp > 0);
		if (numberOfDigits == 2) {
			int firstDigit = number / 10;
			int secondDigit = number % 10;
			if (firstDigit == secondDigit) {
				System.out.println("Числото е палиндром");
			} else {
				System.out.println("Числото не е палиндром");
			}
		}
		if (numberOfDigits == 3) {
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			if (firstDigit == thirdDigit) {
				System.out.println("Числото е палиндром");
			} else {
				System.out.println("Числото не е палиндром");
			}
		}
		if (numberOfDigits == 4) {
			int firstDigit = number / 1000;
			int secondDigit = (number / 100) % 10;
			int thirdDigit = (number / 10) % 10;
			int fourthDigit = number % 10;
			if ((firstDigit == fourthDigit) && (secondDigit == thirdDigit)) {
				System.out.println("Числото е палиндром");
			} else {
				System.out.println("Числото не е палиндром");
			}
		}
		if (numberOfDigits == 5) {
			int firstDigit = number / 10000;
			int secondDigit = (number / 1000) % 10;
			int thirdDigit = (number / 100) % 10;
			int fourthDigit = (number / 10) % 10;
			int fifthDigit = number % 10;
			if ((firstDigit == fifthDigit) && (secondDigit == fourthDigit)) {
				System.out.println("Числото е палиндром");
			} else {
				System.out.println("Числото не е палиндром");
			}
		}

	}
}
