import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int multy = a * b;
		int lastDigit = multy % 10;
		if (lastDigit % 2 == 0) {
			System.out.println(multy + " , " + lastDigit + " четна.");
		} else {
			System.out.println(multy + " , " + lastDigit + " нечетна.");
		}

	}

}
