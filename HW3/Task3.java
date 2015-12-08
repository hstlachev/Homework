import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			if (i < 2) {
				array[i] = number;
			} else {
				array[i] = array[i - 1] + array[i - 2];
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
