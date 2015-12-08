import java.util.Scanner;

public class DAWE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int sum = 0;
		if (number1 > number2) {
			while (number1 >= number2) {
				if (number2 % 3 == 0) {
					System.out.println("skip 3");
					number2++;
					continue;
				}
				System.out.println((number2 * number2) + " ");
				sum += number2 * number2;
				number2++;
				if (sum > 200) {
					break;
				}
			}

		} else {
			while (number1 <= number2) {
				if (number1 % 3 == 0) {
					System.out.println("skip 3");
					number1++;
					continue;
				}
				System.out.println((number1 * number1) + " ");
				sum += number1 * number1;
				number1++;
				if (sum > 200) {
					break;
				}
			}
		}

	}
}