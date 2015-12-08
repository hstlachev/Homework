import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int number2 = sc.nextInt();
		if ((number > 0 && number < 10) && (number2 > 0 && number2 < 10)) {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number2; j++) {
					int tempMulty = i * j;
					System.out.println(i + " * " + j + " = " + tempMulty);
				}
			}
		} else {
			System.out.println("Invalid numbers");
		}
	}
}
