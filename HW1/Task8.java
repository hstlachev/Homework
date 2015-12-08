import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		if (number < 1000 || number > 9999) {
			System.out.println("Wrong number,enter number with 4 digits");
		} else {
			int firstDigit = number / 1000;
			int secondDigit = (number / 100) % 10;
			int thirdDigit = (number / 10) % 10;
			int lastDigit = number % 10;
			int firstNumber = firstDigit * 10 + lastDigit;
			int secondNumber = secondDigit * 10 + thirdDigit;
			if (firstNumber == secondNumber) {
				System.out.println("Равни:(" + firstNumber + "=" + secondNumber + ")");
			}
			if (firstNumber < secondNumber) {
				System.out.println("По-малко:(" + firstNumber + "<" + secondNumber + ")");
			}
			if (firstNumber > secondNumber) {
				System.out.println("По-малко:(" + firstNumber + ">" + secondNumber + ")");
			}
		}
	}
}
