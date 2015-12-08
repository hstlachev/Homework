import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		boolean leapYear = year % 4 == 0;
		if (year % 100 == 0) {
			leapYear = false;
		}
		if (year % 400 == 0) {
			leapYear = true;
		}
		if (day < 1 || day > 31 || month < 1 || month > 12) {
			System.out.println("Enter a valid date.");
		} else {

			if (day == 31) {
				day = 0;
				month++;
			}
			if ((day == 30) && ((month == 4) || (month == 6) || (month == 9) || (month == 11))) {
				day = 1;
				month++;
			}
			if (day == 29 && month == 2 && leapYear) {
				day = 1;
				month++;
			}
			if (day == 28 && month == 2) {
				if (leapYear) {
					day++;
				} else {
					day = 1;
					month++;
				}

			} else {
				day++;
			}

		}

		if (month == 13) {
			month = 1;
			year++;
		}
		System.out.println(day + "," + month + "," + year);
	}

}
