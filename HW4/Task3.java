import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[][] array = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 }, };
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				sum += array[i][j];
			}
		}
		System.out.println(sum);
		double middle = (double) sum / 30;
		System.out.println(middle);
	}
}
