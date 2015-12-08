import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberN = sc.nextInt();
		int numberM = sc.nextInt();
		if ((numberN < 5555 && numberN > 10) && (numberM < 5555 && numberM > 10)) {
			if (numberN < numberM) {
				for (int i = numberM; i >= numberN; i--) {
					if (i % 50 == 0) {
						System.out.println(i);
					}
				}
			}
			if (numberM < numberN) {
				for (int i = numberN; i >= numberM; i--) {
					if (i % 50 == 0) {
						System.out.println(i);
					}
				}
			}
		} else {
			System.out.println("Invalid numbers");
		}
	}
}
