import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentance");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		String[] upgWords = new String[words.length];
		int maxChars = 0;
		int wordCount = 0;
		int length = 0;
		for (int i = 0; i < words.length; i++) {
			wordCount++;
			length = words[i].length();
			if (length > maxChars) {
				maxChars = length;
			}

		}
		System.out.println(wordCount + " думи " + "най-дългата е с " + maxChars + " символа");
	}
}
