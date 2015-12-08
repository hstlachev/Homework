import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = 1;
		if (number > 0 && number < 1000) {
			while (temp <= 10) {
				if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0) {
					System.out.println(temp + ":" + number);
					temp++;
				}
				number++;
			}
		} else {
			System.out.println("Invalid number");
		}
	}
}