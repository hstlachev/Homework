public class main {
	public static void main(String[] args) {
		int[][] array = { { 48, 72, 13, 14, 15 }, { 21, 22, 53, 24, 75 }, { 31, 57, 33, 34, 35 },
				{ 41, 95, 43, 44, 45 }, { 59, 52, 53, 54, 55 }, { 61, 69, 63, 64, 65 }, };
		int min = array[0][0];
		int max = array[0][0];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
				}
				if (array[i][j] < min) {
					min = array[i][j];
				}
			}
		}
		System.out.println("���-����� " + min);
		System.out.println("���-������ " + max);
	}
}
