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
		int[] array2 = new int[size];
		array2[0] = array1[0];
		array2[size - 1] = array1[size - 1];
		for (int i = 1; i < array2.length - 1; i++) {
			array2[i] = array1[i - 1] + array1[i + 1];
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

	}
}
