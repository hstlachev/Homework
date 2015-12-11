import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[][] array = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int sum = 0;
		for (int i = 0; i < 6; i++) {
			int sum1 = 0;
			for (int j = 0; j < 6; j++) {
				if ((i + j) % 2 == 0) {
					sum1 += array[i][j];
					System.out.print(array[i][j] + ",");
				}
			}
			sum += sum1;
			System.out.println("сума от елементите за реда е:" + sum1);
		}
		System.out.println("Сума на елементите е:"+sum);
	}
}
