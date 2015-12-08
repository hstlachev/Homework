import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[7];
		System.out.println("Enter the numbers in the array");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int temp = array[0];
		for (int i = 0; i < array.length/2; i++) {
			array[array.length-1-i]=array[i];
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
