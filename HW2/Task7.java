import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= number * 3; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}
}
