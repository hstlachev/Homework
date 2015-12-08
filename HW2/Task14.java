import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number >= 10 && number <= 200) {
			while (number > 1) {
				if (number % 7 == 0) {
					System.out.println(number);
				}
				number--;
			}
		}

	}
}
