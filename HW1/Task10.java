import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int volume = sc.nextInt();
		int waterLeft = volume % 5;
		int numberOfBuckets = volume / 5;
		if (waterLeft == 1) {
			System.out.println((numberOfBuckets - 1) + " пъти по 2 литра");
			System.out.println((numberOfBuckets - 1) + " пъти по 3 литра");
			System.out.println("2 допълнителни кофи от 3 литра");
		}
		if (waterLeft == 2) {
			System.out.println(numberOfBuckets + " пъти по 2 литра");
			System.out.println(numberOfBuckets + " пъти по 3 литра");
			System.out.println("допълнителна кофа от 2 литра");
		}
		if (waterLeft == 3) {
			System.out.println(numberOfBuckets + " пъти по 2 литра");
			System.out.println(numberOfBuckets + " пъти по 3 литра");
			System.out.println("допълнителна кофа от 3 литра");
		}
		if (waterLeft == 4) {
			System.out.println(numberOfBuckets + " пъти по 2 литра");
			System.out.println(numberOfBuckets + " пъти по 3 литра");
			System.out.println("2 допълнителни кофи от 2 литра");
		}
	}
}
