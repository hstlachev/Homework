import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		boolean isMirror = true;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
				isMirror = false;
			}
		}
		if (isMirror) {
			System.out.println("да");
		} else {
			System.out.println("не");
		}
	}

}
