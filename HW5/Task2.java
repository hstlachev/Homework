import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words");
		String first = sc.next();
		String second = sc.next();
		int lenghtOfFirst = first.length();
		int lenghtOfSecond = second.length();
		if (lenghtOfFirst > lenghtOfSecond) {
			System.out.print(lenghtOfFirst + " ");
			System.out.println(second.substring(0, 5) + first.substring(5));
		}
		if (lenghtOfFirst < lenghtOfSecond) {
			System.out.print(lenghtOfSecond + " ");
			System.out.println(first.substring(0, 5) + second.substring(5));
		}
		if (lenghtOfFirst == lenghtOfSecond) {
			System.out.println("Strings are with equal lenght");
		}

	}

}
