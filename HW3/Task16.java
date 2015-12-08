import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, -7.5, 8.6, 9.1, -4 };
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] < -0.231) {
				array[i] = ((i + 1) * (i + 1)) + 41.25;
			} else {
				array[i] = array[i] * (i + 1);
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
	}
}
