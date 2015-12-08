import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 1;
		do {
			sum *= number;
			number--;
		} while (number > 0);
		System.out.println(sum);
	}
}
