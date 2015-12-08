import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		if (hour < 0 || hour > 24) {
			System.out.println("Invalid hour");
		} else {
			if ((hour > 18 && hour < 25) || (hour >= 0 && hour < 4)) {
				System.out.println("Добър вечер");
			}
			if (hour < 9 && hour >= 4) {
				System.out.println("Добро утро");
			}
			if (hour >= 9 && hour <= 18) {
				System.out.println("Добър ден");
			}
		}
	}

}
