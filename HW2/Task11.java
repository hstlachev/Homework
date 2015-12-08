import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = 1;
		int counter1 = 1;
		int counter2 = number1;
		while (counter1 <= number1) {
			for (int i = 1; i <= counter2; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= number2; j++) {
				System.out.print("*");
			}
			number2 += 2;
			counter1++;
			counter2--;
			System.out.println(" ");
		}
	}
}
