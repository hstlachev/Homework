import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int realSum = sc.nextInt();
		for (int number = 100; number < 1000; number++) {
			int firstDigit = number / 100;
			int secondDigit = (number / 10) % 10;
			int thirdDigit = number % 10;
			int sum = firstDigit + secondDigit + thirdDigit;
			if (sum == realSum) {
				System.out.println(number);
			}

		}

	}
}
