import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int[] array1 = { 18, 19, 32, 1, 3, 4, 5, 6, 7, 8 };
		int[] array2 = { 1, 2, 3, 4, 5, 16, 17, 18, 27, 11 };
		int[] array3=new int[10];
		for (int i = 0; i < array1.length; i++) {
			if(array1[i]>=array2[i]){
				array3[i]=array1[i];
			}
			if(array1[i]<array2[i]){
				array3[i]=array2[i];
			}
		}
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + ",");
		}
	}
}