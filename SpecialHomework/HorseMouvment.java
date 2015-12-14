import java.util.Scanner;

public class Task3 {
	static void fill(char[][] arr, int firstCoo, int secondCoo) {
		int row = arr.length;
		int col = arr[0].length;
		arr[firstCoo][secondCoo] = '.';
		if (firstCoo + 1 < row && secondCoo + 2 < col) {
			if (arr[firstCoo + 1][secondCoo + 2] != '.') {
				fill(arr, firstCoo + 1, secondCoo + 2);
			}
		}
		if (firstCoo + 2 < row && secondCoo + 1 < col) {
			if (arr[firstCoo + 2][secondCoo + 1] != '.') {
				fill(arr, firstCoo + 2, secondCoo + 1);
			}
		}
		if (firstCoo + 2 < row && secondCoo - 1 > -1) {
			if (arr[firstCoo + 2][secondCoo - 1] != '.') {
				fill(arr, firstCoo + 2, secondCoo - 1);
			}
		}
		if (firstCoo + 1 < row && secondCoo - 2 > -1) {
			if (arr[firstCoo + 1][secondCoo - 2] != '.') {
				fill(arr, firstCoo + 1, secondCoo - 2);
			}
		}
		if (firstCoo - 1 > -1 && secondCoo - 2 > -1) {
			if (arr[firstCoo - 1][secondCoo - 2] != '.') {
				fill(arr, firstCoo - 1, secondCoo - 2);
			}
		}
		if (firstCoo - 2 > -1 && secondCoo - 1 > -1) {
			if (arr[firstCoo - 2][secondCoo - 1] != '.') {
				fill(arr, firstCoo - 2, secondCoo - 1);
			}
		}
		if (firstCoo - 2 > -1 && secondCoo + 1 < col) {
			if (arr[firstCoo - 2][secondCoo + 1] != '.') {
				fill(arr, firstCoo - 2, secondCoo + 1);
			}
		}
		if (firstCoo - 1 > -1 && secondCoo + 2 < col) {
			if (arr[firstCoo - 1][secondCoo + 2] != '.') {
				fill(arr, firstCoo - 1, secondCoo + 2);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions");
		int row = sc.nextInt();
		int col = sc.nextInt();
		char[][] arr = new char[row][col];
		System.out.println("Enter point");
		int first = sc.nextInt();
		int second = sc.nextInt();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j]=',';
			}		
		}
		if (first > row || first < 0 || row < 0 || second > col || second < 0 || col < 0) {
			System.out.println("Invalid input");
			return;
		}
		fill(arr, first, second);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
