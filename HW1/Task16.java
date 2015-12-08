import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number < 100 || number > 999) {
			System.out.println("Invalid number,you must enter a number with 3 digits");
		} else {
			int a = number / 100;
			int b = (number / 10) % 10;
			int c = number % 10;
			if (a == b && b == c) {
				System.out.println("Цифрите са равни");
			}
			if (a > b && b > c) {
				System.out.println("Цифрите са във низходящ ред");
			}
			if (a < b && b < c) {
				System.out.println("Цифрите са във възходящ ред");
			}
			if (!(a == b && b == c) && !(a > b && b > c) && !(a < b && b < c))
				System.out.println("Цифрите са ненаредени");
		}
	}

}
