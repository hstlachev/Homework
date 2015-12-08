import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String strenght = "2";
		String color = "спатия";
		if (number > 0 && number < 53) {
			for (int i = number; i < 53; i++) {
				int temp = i;
				switch (temp % 4) {
				case 1:
					color = "спатия, ";
					break;
				case 2:
					color = "каро, ";
					break;
				case 3:
					color = "купа, ";
					break;
				case 0:
					color = "пика, ";
					break;
				}
				switch (((temp - 1) / 4) + 2) {
				case 2:
					strenght = "2 ";
					break;
				case 3:
					strenght = "3 ";
					break;
				case 4:
					strenght = "4 ";
					break;
				case 5:
					strenght = "5 ";
					break;
				case 6:
					strenght = "6 ";
					break;
				case 7:
					strenght = "7 ";
					break;
				case 8:
					strenght = "8 ";
					break;
				case 9:
					strenght = "9 ";
					break;
				case 10:
					strenght = "10 ";
					break;
				case 11:
					strenght = "Вале ";
					break;
				case 12:
					strenght = "Дама ";
					break;
				case 13:
					strenght = "Поп ";
					break;
				case 14:
					strenght = "Асо ";
					break;
				}
				System.out.print(strenght + color);
			}
		} else {
			System.out.println("Invalid number");
		}
	}
}
