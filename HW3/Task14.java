import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		double[] array1 = new double[size];
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextDouble();
		}
		double[] array2 = new double[size];
		int temp = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] < 2.99 && array1[i] > -2.99) {
				array2[temp] = array1[i];
				temp++;
			}
		}
		for (int i = 0; i < array2.length; i++) {
			if (array2[i] != 0) {
				System.out.println(array2[i]);
			}
		}
	}
}
