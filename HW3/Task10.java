import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] array = new int[size];
		int sum = 0;
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double avg = (double) sum / (double) size;
		double diff;
		double minDiff = 33333;
		int number = 0;
		double actualDiff = 0;
		for (int i = 0; i < array.length; i++) {
			diff = (double) array[i] - avg;
			if (diff < 0) {
				actualDiff = -diff;
			}
			if (diff >= 0) {
				actualDiff = diff;
			}

			if (actualDiff < minDiff) {
				minDiff = actualDiff;
				number = array[i];
			}
		}
		System.out.println("Средна стойност " + (float) avg + ",най-близка стойност " + number);
	}
}
