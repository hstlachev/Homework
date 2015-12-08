import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				System.out.println("Number isn't prime");
				break;
			}
		}
		if (isPrime) {
			System.out.println("Number is prime");
		}
	}
}
