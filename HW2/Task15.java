import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= number);
		System.out.println(sum);

	}
}
