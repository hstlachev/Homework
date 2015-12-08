import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[] array = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int i = array.length - 1;
		while (number > 0) {
			if (number % 2 == 1) {
				array[i] = 1;
			}
			i--;
			number /= 2;
		}
		int temp = 0;
		for (int j = 0; j < array.length; j++) {
			if (array[j] != 0) {
				temp = 1;
			}
			if (temp == 1) {
				System.out.print(array[j]);
			}
		}
	}
}
