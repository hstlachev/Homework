import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String symbol = sc.next();
		for (int i = 1; i <= number; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
		for (int i = 1; i <= number - 2; i++) {
			System.out.print("*");
			for (int j = 1; j <= number - 2; j++) {
				System.out.print(symbol);
			}
			System.out.print("*");
			System.out.println(" ");
		}
		for (int i = 1; i <= number; i++) {
			System.out.print("*");
		}
	}
}
