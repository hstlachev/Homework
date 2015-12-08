import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		double money = sc.nextDouble();
		boolean health = sc.nextBoolean();
		if (!health) {
			if (money > 1) {
				System.out.println("I won't go out,but I will buy medicine");
			} else {
				System.out.println("I won't go out,I will drink tea at home");
			}
		} else {
			if (money > 10) {
				System.out.println("I will go to the cinema with friends");
			} else {
				System.out.println("I will go to the cafe with friends");
			}
		}

	}

}
