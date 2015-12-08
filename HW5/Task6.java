import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentance");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		String[] upgWords = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
			upgWords[i] = words[i].replace(words[i].charAt(0), Character.toUpperCase(words[i].charAt(0)));
		}
		for (int i = 0; i < words.length; i++) {
			System.out.println(upgWords[i]);
		}
	}

}
