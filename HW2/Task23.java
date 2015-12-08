import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int i = 1;
		while (i < 10) {
			int j = i;
			while (j < 10) {
				int multy = i * j;
				System.out.println(i + " * " + j + " = " + multy);
				j++;
			}
			i++;
		}
	}
}
