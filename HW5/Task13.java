import java.util.Scanner;

public class main {
	static int[] concatArray(int[] array1,int[] array2) {
		int[] arr=new int[array1.length+array2.length];
		for (int i = 0; i < array1.length; i++) {
			arr[i]=array1[i];
			System.out.print(arr[i] + " ");
		}
		int j=0;
		for (int i = array1.length; i < arr.length; i++) {
			arr[i]=array2[j];
			System.out.print(arr[i] + " ");
			j++;
		}
		return arr;
	}

	public static void main(String[] args) {

		int[] arr = {3,6,4,5,8,9,5,656};
		int[] arr2={1,1,1,1,1,1};
		concatArray(arr,arr2);
	}
}
