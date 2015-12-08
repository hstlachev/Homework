
import java.util.Scanner;

public class main {
	static int[] makeArray(int number) {
		int[] arr = new int[number];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		return arr;
	}

	public static void main(String[] args) {
		makeArray(5);
	}
}
