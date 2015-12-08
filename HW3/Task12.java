import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] array = new int[size];
		int temp = 0;
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;

			}
			if (i == 2) {
				int sum = 0;
				sum = array[i] + array[i + 1];
				array[i + 1] = sum - array[i + 1];
				array[i] = sum - array[i];

			}
			if (i == 4) {
				int multy = array[i] * array[i + 1];
				array[i + 1] = multy / array[i + 1];
				array[i] = multy / array[i];

			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
