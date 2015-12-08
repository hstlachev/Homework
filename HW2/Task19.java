import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp;
		if (number > 9 && number < 100) {
			while (number > 1) {
				temp = number;
				if (temp % 2 == 0) {
					number /= 2;
				}
				if (temp % 2 == 1) {
					number = (number * 3) + 1;
				}
				System.out.println(number);
			}
		} else {
			System.out.println("Invalid number");
		}
	}
}
