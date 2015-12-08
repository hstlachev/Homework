import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		if (number1 > number2) {
			while (number2 <= number1) {
				System.out.println(number2);
				number2++;
			}
		}
		else {
			while (number2 >= number1) {
				System.out.println(number1);
				number1++;

			}
		}
	}

}
