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
		boolean isOtherNumbersMirror = true;
		boolean isMiddleNumberMirror = true;
		for (int i = 0; i < array.length / 2; i++) {
			if (array[array.length - 1 - i] != array[i]) {
				isOtherNumbersMirror = false;
				break;
			}
		}
		if ((size % 2 == 1) && (size != 1)) {
			int middleOfArray = array[(array.length / 2) + 1];
			if (middleOfArray > 9)
				if ((middleOfArray % 11 != 0) && (middleOfArray % 111 != 0) && (middleOfArray % 1111 != 0)) {
					isMiddleNumberMirror = false;
				}
		}
		if (isMiddleNumberMirror && isOtherNumbersMirror) {
			System.out.println("Масивът е огледален");
		}
		if (!(isMiddleNumberMirror && isOtherNumbersMirror)) {
			System.out.println("Масивът не е огледален");
		}

	}

}
