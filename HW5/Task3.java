import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two words");
		String text = sc.next();
		String[] words = text.split(",");
		String first = words[0];
		String second = words[1];
		int lenghtOfFirst = first.length();
		int lenghtOfSecond = second.length();
		if (lenghtOfFirst > lenghtOfSecond) {
			System.out.println("������� ��� � ��-����� �� ������");
			for (int i = 0; i < lenghtOfSecond; i++) {
				if (first.charAt(i) != second.charAt(i)) {
					System.out.println(i + " " + first.charAt(i) + " - " + second.charAt(i));
				}
			}
		}
		if (lenghtOfFirst < lenghtOfSecond) {
			System.out.println("������� ��� � ��-����� �� ������");
			for (int i = 0; i < lenghtOfFirst; i++) {
				if (first.charAt(i) != second.charAt(i)) {
					System.out.println(i + " " + first.charAt(i) + " - " + second.charAt(i));
				}
			}
		}
		if (lenghtOfFirst == lenghtOfSecond) {
			System.out.println("����� ���� �� � ������� �������");
			for (int i = 0; i < lenghtOfFirst; i++) {
				if (first.charAt(i) != second.charAt(i)) {
					System.out.println(i + " " + first.charAt(i) + " - " + second.charAt(i));
				}
			}
		}

	}

}
