import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		double[] array1 = new double[size];
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextDouble();
		}
		double number1 = 0;
		double number2 = 0;
		double number3 = 0;
		for (int i = 0; i < array1.length; i++) {
			double actaulValue = 0;
			if (array1[i] < 0) {
				actaulValue = -array1[i];
			}
			if (array1[i] >= 0) {
				actaulValue = array1[i];
			}

			if (actaulValue > number1) {
				number1 = actaulValue;
			}
		}

		System.out.print(number1 + "; ");
		for (int i = 0; i < array1.length; i++) {
			double actaulValue = 0;
			if (array1[i] < 0) {
				actaulValue = -array1[i];
			}
			if (array1[i] >= 0) {
				actaulValue = array1[i];
			}

			if (actaulValue > number2 && actaulValue < number1) {
				number2 = actaulValue;
			}
		}
		System.out.print(number2 + "; ");
		for (int i = 0; i < array1.length; i++) {
			double actaulValue = 0;
			if (array1[i] < 0) {
				actaulValue = -array1[i];
			}
			if (array1[i] >= 0) {
				actaulValue = array1[i];
			}

			if (actaulValue > number3 && actaulValue < number2) {
				number3 = actaulValue;
			}
		}
		System.out.println(number3);
	}
}
