import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 4;
		int cols = 4;
		int[][] array = new int[rows][cols];
		System.out.println("Enter the numbers int the array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		int sum = 0;

		int maxRow = 0;
		int maxCol = 0;
		for (int i = 0; i < rows; i++) {
			sum = 0;
			for (int j = 0; j < cols; j++) {
				sum += array[i][j];
			}
			if (sum > maxRow) {
				maxRow = sum;
			}
		}
		for (int i = 0; i < rows; i++) {
			sum = 0;
			for (int j = 0; j < cols; j++) {
				sum += array[j][i];
			}
			if (sum > maxCol) {
				maxCol = sum;
			}
		}
		System.out.println("���-�������� ���� �� ������" + maxRow);
		System.out.println("���-�������� ���� �� ������" + maxCol);
		if (maxCol > maxRow) {
			System.out.println("������������ ���� �� ������ � ��-������ �� ������������ ���� �� ������");
		} else {
			System.out.println("������������ ���� �� ������ � ��-������ �� ������������ ���� �� ������");
		}

	}
}
