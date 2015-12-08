import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[][] array = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == 1) {
					sum1 += array[i][j];
				}
				if (i == 3) {
					sum2 += array[i][j];
				}
				if (i == 5) {
					sum3 += array[i][j];
				}
			}
		}
		int sum = sum1 + sum2 + sum3;
		System.out.println("Сумата на втория ред е:" + sum1);
		System.out.println("Сумата на четвъртият ред е:" + sum2);
		System.out.println("Сумата на шестият ред е:" + sum3);
		System.out.println("Сумата на елементите е:" + sum);

	}
}
