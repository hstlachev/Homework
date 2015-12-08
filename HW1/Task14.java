import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstCoordinate = sc.nextInt();
		int secondCoordinate = sc.nextInt();
		int thirdCoordinate = sc.nextInt();
		int fourthCoordinate = sc.nextInt();
		int firstPosition = firstCoordinate + secondCoordinate;
		int secondPosition = thirdCoordinate + fourthCoordinate;
		if ((firstCoordinate + secondCoordinate + thirdCoordinate + fourthCoordinate) < 1
				|| (firstCoordinate + secondCoordinate + thirdCoordinate + fourthCoordinate) > 32) {
			System.out.println("Invalid coordinates");
		} else {
			if ((firstPosition % 2 == 0 && secondPosition % 2 == 0)
					|| (firstPosition % 2 == 1 && secondPosition % 2 == 1)) {
				System.out.println("Позициите са с еднакъв цвят");
			} else {
				System.out.println("Позициите са с различен цвят");
			}
		}
	}

}
