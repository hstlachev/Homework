import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = sc.nextLine();
		System.out.println("Enter second string");
		String second = sc.nextLine();
		System.out.print(first.toUpperCase() + " ");
		System.out.println(first.toLowerCase());
		System.out.print(second.toUpperCase() + " ");
		System.out.println(second.toLowerCase());

	}

}
