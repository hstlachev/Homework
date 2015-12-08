import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		boolean isZig = true;
		for (int i = 1; i < array.length - 1; i += 2) {
			if ((array[i] < array[i - 1]) && (array[i] < array[i] + 1)) {
				isZig = false;
			}
		}
		for (int i = 1; i < array.length - 2; i++) {
			if (!(array[i] < array[i + 2]) && i % 2 == 1) {
				isZig = false;
			}
		}
		if (isZig) {
			System.out.println("изпълнява изискванията за зигзагообразна нагоре редица");
		} else {
			System.out.println("не изпълнява изискванията за зигзагообразна нагоре редица");
		}
	}
}
