import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array1 = new int[size];
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		int temp = 0;
		int max = 0;
		int saviour = 0;
		for (int i = 0; i < array1.length - 1; i++) {
			if (array1[i] == array1[i + 1]) {
				temp++;
			}
			if (temp > max) {
				max = temp;
				saviour = array1[i];
			}
			if (array1[i] != array1[i + 1]) {
				temp = 0;
			}

		}
		for (int i = 0; i <= max; i++) {
			System.out.print(saviour+" ");
		}

	}
}
