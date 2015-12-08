import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = sc.nextLine();
		System.out.println("Enter second string");
		String second = sc.nextLine();
		int lenghtOfFirst = first.length();
		int lenghtOfSecond = second.length();
		int firstindex = -1;
		int secondindex = -1;
		boolean match = false;
		for (int i = 0; i < lenghtOfFirst; i++) {
			firstindex++;
			secondindex = 0;
			for (int j = 0; j < lenghtOfSecond; j++) {
				secondindex++;
				if (first.charAt(i) == second.charAt(j)) {
					match = true;
					break;
				}
			}
			if (match) {
				break;
			}
		}
		if (match) {
			for (int i = 0; i < lenghtOfFirst; i++) {
				if (i == firstindex) {
					System.out.println(second);
					continue;
				}
				for (int j = 0; j < secondindex - 1; j++) {
					System.out.print(" ");
				}
				System.out.println(first.charAt(i));
			}
		} else {
			System.out.println("There is no match");
		}
	}
}
