import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		char[] arr = word.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.print((char) (arr[i] + 5));
		}
	}
}