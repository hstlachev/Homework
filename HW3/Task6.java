import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int size1 = sc.nextInt();
		int[] array1 = new int[size1];
		System.out.println("Enter the numbers in the first array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of the second array");
		int size2 = sc.nextInt();
		int[] array2 = new int[size2];
		System.out.println("Enter the numbers in the second array");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		boolean equality = true;
		if (size1 != size2) {
			equality = false;
		}
		if (size1 == size2) {
			for (int i = 0; i < array2.length; i++) {
				if (array1[i] != array2[i]) {
					equality = false;
				}
			}
		}
		if (equality) {
			System.out.println("Масивите са еднакви");
		}
		if (!(equality)) {
			System.out.println("Масивите не са еднакви");
		}

	}
}
