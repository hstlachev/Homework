import java.util.Scanner;

public class main {
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,6,4,5,8,9,5,656};
		printArray(arr);
	}
}
