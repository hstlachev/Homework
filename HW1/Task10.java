import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int volume = sc.nextInt();
		int waterLeft = volume % 5;
		int numberOfBuckets = volume / 5;
		if (waterLeft == 1) {
			System.out.println((numberOfBuckets - 1) + " ���� �� 2 �����");
			System.out.println((numberOfBuckets - 1) + " ���� �� 3 �����");
			System.out.println("2 ������������ ���� �� 3 �����");
		}
		if (waterLeft == 2) {
			System.out.println(numberOfBuckets + " ���� �� 2 �����");
			System.out.println(numberOfBuckets + " ���� �� 3 �����");
			System.out.println("������������ ���� �� 2 �����");
		}
		if (waterLeft == 3) {
			System.out.println(numberOfBuckets + " ���� �� 2 �����");
			System.out.println(numberOfBuckets + " ���� �� 3 �����");
			System.out.println("������������ ���� �� 3 �����");
		}
		if (waterLeft == 4) {
			System.out.println(numberOfBuckets + " ���� �� 2 �����");
			System.out.println(numberOfBuckets + " ���� �� 3 �����");
			System.out.println("2 ������������ ���� �� 2 �����");
		}
	}
}
