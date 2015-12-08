import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		String[] sentence = { "Hello", "world", "in", "a", "frame" };
		int longestWord = 0;
		for (int i = 0; i < sentence.length; i++) {
			if (sentence[i].length() > longestWord) {
				longestWord = sentence[i].length();
			}
		}
		int frame = longestWord + 2;
		for (int i = 0; i < frame; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < sentence.length; i++) {
			System.out.print("*");
			int difference=longestWord-sentence[i].length();
			System.out.print(sentence[i]);
			for(int j=0;j<difference;j++){
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		for (int i = 0; i <frame; i++) {
			System.out.print("*");
		}
	}
}
