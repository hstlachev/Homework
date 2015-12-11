import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		word = word + "gh";
		char[] arr = word.toCharArray();
		int number = 0;
		int sum = 0;
		boolean isPositive = true;
		boolean isNumberBefore = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - '0' > -1 && arr[i] - '0' < 10) {
				if (isNumberBefore) {
					number = number * 10 + arr[i] - '0';
				}
				if (isNumberBefore == false) {
					number = arr[i] - '0';
					isNumberBefore = true;
				}
			}
			if (!(arr[i] - '0' > -1 && arr[i] - '0' < 10)) {
				if (isPositive == false) {
					number = -number;
				}
				if (number != 0) {
					System.out.println(number);
				}
				sum += number;
				number = 0;
				isNumberBefore = false;
				isPositive = true;
			}
			if (arr[i] == '-') {
				isPositive = false;
			}
		}
		System.out.println("Сума = " + sum);

	}
}
