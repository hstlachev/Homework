import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 7;
		int[] array = new int[size];
		int temp = 0;
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] > 5) {
				System.out.print(array[i] + " ");
				temp++;
			}
		}
		System.out.println(" - " + temp + " числа");
	}
}
