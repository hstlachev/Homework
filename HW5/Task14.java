
import java.util.Scanner;

public class main {
	static void faktoriel(int number) {
		int sum = 1;
		for (int i = 1; i <= number; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		faktoriel(5);
	}
}
