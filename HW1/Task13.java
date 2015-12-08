import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperature = sc.nextInt();
		if (temperature < -100 || temperature > 100) {
			System.out.println("Impossible temperature");
		} else {
			if (temperature < -19) {
				System.out.println("Ледено студено");
			}
			if (temperature > -20 && temperature < 1) {
				System.out.println("Студено");
			}
			if (temperature > 0 && temperature < 15) {
				System.out.println("Хладно");
			}
			if (temperature > 14 && temperature < 25) {
				System.out.println("Топло");
			}
			if (temperature > 24) {
				System.out.println("Горещо");
			}
		}
	}

}
