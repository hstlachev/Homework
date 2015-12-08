import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		int[][] array = new int[rows][rows];
		System.out.println("Enter the numbers int the array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i == j) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				if (i + j == rows - 1) {
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

}
