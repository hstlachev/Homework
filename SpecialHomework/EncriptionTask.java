import java.util.Scanner;

public class Task1 {

	static String encrypt(String word) {
		char[][] code = { { 'M', 'R', 'E', 'O', 'P' }, { 'U', 'B', 'F', 'G', 'T' }, { 'C', 'D', 'A', 'H', 'Q' },
				{ 'V', 'I', 'J', 'K', 'X' }, { 'L', 'W', 'S', 'Y', 'N' } };
		if (word.length() % 2 == 1) {
			word = word + "A";
		}
		String newWord = "";
		for (int i = 0; i < word.length(); i += 2) {
			char first = word.charAt(i);
			char second = word.charAt(i + 1);
			int oldRow1 = 0;
			int oldCol1 = 0;
			int oldRow2 = 0;
			int oldCol2 = 0;

			int newRow1 = 0;
			int newCol1 = 0;
			int newRow2 = 0;
			int newCol2 = 0;
			for (int row = 0; row < 5; row++) {
				for (int col = 0; col < 5; col++) {
					if (first == code[row][col]) {
						oldRow1 = row;
						oldCol1 = col;
					}
					if (second == code[row][col]) {
						oldRow2 = row;
						oldCol2 = col;
					}
				}
			}
			if (oldRow1 != oldRow2 && oldCol1 != oldCol2) {
				newRow1 = oldRow1;
				newRow2 = oldRow2;
				newCol1 = oldCol2;
				newCol2 = oldCol1;
				newWord += code[newRow1][newCol1];
				newWord += code[newRow2][newCol2];
			}
			if (oldRow1 == oldRow2) {
				newRow1 = oldRow1;
				newRow2 = oldRow2;
				newCol1 = oldCol1 + 1;
				newCol2 = oldCol2 + 1;
				if (newCol1 == 5) {
					newCol1 = 0;
				}
				if (newCol2 == 5) {
					newCol2 = 0;
				}
				newWord += code[newRow1][newCol1];
				newWord += code[newRow2][newCol2];
			}
			if (oldCol1 == oldCol2) {
				newRow1 = oldRow1 + 1;
				newRow2 = oldRow2 + 1;
				newCol1 = oldCol1;
				newCol2 = oldCol2;
				if (newRow1 == 5) {
					newRow1 = 0;
				}
				if (newRow2 == 5) {
					newRow2 = 0;
				}
				newWord += code[newRow1][newCol1];
				newWord += code[newRow2][newCol2];
			}
		}
		System.out.println(newWord);
		return newWord;
	}
	
	static String decrypt(String word) {
		char[][] code = { { 'M', 'R', 'E', 'O', 'P' }, { 'U', 'B', 'F', 'G', 'T' }, { 'C', 'D', 'A', 'H', 'Q' },
				{ 'V', 'I', 'J', 'K', 'X' }, { 'L', 'W', 'S', 'Y', 'N' } };
		String newWord = "";
		for (int i = 0; i < word.length(); i += 2) {
			char first = word.charAt(i);
			char second = word.charAt(i + 1);
			int oldRow1 = 0;
			int oldCol1 = 0;
			int oldRow2 = 0;
			int oldCol2 = 0;

			int newRow1 = 0;
			int newCol1 = 0;
			int newRow2 = 0;
			int newCol2 = 0;
			for (int row = 0; row < 5; row++) {
				for (int col = 0; col < 5; col++) {
					if (first == code[row][col]) {
						oldRow1 = row;
						oldCol1 = col;
					}
					if (second == code[row][col]) {
						oldRow2 = row;
						oldCol2 = col;
					}
				}
			}
			if (oldRow1 != oldRow2 && oldCol1 != oldCol2) {
				newRow1 = oldRow1;
				newRow2 = oldRow2;
				newCol1 = oldCol2;
				newCol2 = oldCol1;
				newWord += code[newRow1][newCol1];
				newWord += code[newRow2][newCol2];
			}
			if (oldRow1 == oldRow2) {
				newRow1 = oldRow1;
				newRow2 = oldRow2;
				newCol1 = oldCol1 - 1;
				newCol2 = oldCol2 - 1;
				if (newCol1 == -1) {
					newCol1 = 4;
				}
				if (newCol2 == -1) {
					newCol2 = 4;
				}
				newWord += code[newRow1][newCol1];
				newWord += code[newRow2][newCol2];
			}
			if (oldCol1 == oldCol2) {
				newRow1 = oldRow1 - 1;
				newRow2 = oldRow2 - 1;
				newCol1 = oldCol1;
				newCol2 = oldCol2;
				if (newRow1 == -1) {
					newRow1 = 4;
				}
				if (newRow2 == -1) {
					newRow2 = 4;
				}
				newWord += code[newRow1][newCol1];
				newWord += code[newRow2][newCol2];
			}
		}
		System.out.println(newWord);
		return newWord;
	}

	public static void main(String[] args) {
		char[][] code = { { 'M', 'R', 'E', 'O', 'P' }, { 'U', 'B', 'F', 'G', 'T' }, { 'C', 'D', 'A', 'H', 'G' },
				{ 'V', 'I', 'J', 'K', 'X' }, { 'L', 'W', 'S', 'Y', 'N' } };
		Scanner sc = new Scanner(System.in);
		String oldWord = sc.nextLine();
		String word = oldWord.toUpperCase();

		String newWord = encrypt(word);
		decrypt(newWord);

	}

}
