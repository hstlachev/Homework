import java.util.Scanner;

public class main {

	public static int fill(Item[] items, Knapsack mySack) {

		int maxCapacity = mySack.getWeigh();
		int[][] myMatrix = new int[items.length + 1][maxCapacity + 1];
		for (int col = 0; col <= maxCapacity; col++) {
			for (int row = 0; row <= items.length; row++) {
				myMatrix[row][col] = 0;
			}
		}
		for (int item = 1; item <= items.length; item++) {
			for (int weight = 1; weight <= maxCapacity; weight++) {
				if (items[item - 1].getWeigh() <= weight) {
					myMatrix[item][weight] = Math.max(
							items[item - 1].getValue() + myMatrix[item - 1][weight - items[item - 1].getWeigh()],
							myMatrix[item - 1][weight]);
				} else {
					myMatrix[item][weight] = myMatrix[item - 1][weight];
				}
			}
		}
		return myMatrix[items.length][maxCapacity];
	}

	public static void main(String[] args) {
		Item item1 = new Item("kamuk", 4, 1);
		Item item2 = new Item("golqm kamuk", 3, 1);
		Item item3 = new Item("biju", 5, 30);
		Item item4 = new Item("tv", 2, 20);

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int value = sc.nextInt();
		int weigh = sc.nextInt();
		while (value < 0 && weigh < 0) {
			System.out.println("Invalid input");
			value = sc.nextInt();
			weigh = sc.nextInt();
		}
		Item[] items = { item1, item2, item3, item4 };
		Knapsack mySack = new Knapsack(10);
		System.out.println(fill(items, mySack));
	}

}
