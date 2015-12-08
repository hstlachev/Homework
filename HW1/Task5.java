import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();
		if (num1 < num2 && num1 < num3) {
			if (num2 < num3) {
				System.out.println(num3 + " " + num2 + " " + num1);
			} else {
				System.out.println(num2 + " " + num3 + " " + num1);
			}
		}

		if (num2 < num1 && num2 < num3) {
			if (num1 < num3) {
				System.out.println(num3 + " " + num1 + " " + num2);
			} else {
				System.out.println(num1 + " " + num3 + " " + num2);
			}
		}

		if (num3 < num1 && num3 < num2) {
			if (num1 < num2) {
				System.out.println(num2 + " " + num1 + " " + num3);
			} else {
				System.out.println(num1 + " " + num2 + " " + num3);
			}
		}

	}

}
