import java.util.Scanner;

public class Homework1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Въведете A");
		double num1=sc.nextDouble();
		System.out.println("Въведете B");
		double num2=sc.nextDouble();
		System.out.println("Въведете C");
		double num3=sc.nextDouble();
		if(((num3<num1)&&(num3<num2))||((num3>num1)&&(num3>num2)))
		{	
		}
		else{
			System.out.println("Числото "+num1+" е между "+num2+" и "+num3);
		}

		
		

	}

}
