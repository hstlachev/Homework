import java.util.Scanner;

public class Homework1 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�������� A");
		double num1=sc.nextDouble();
		System.out.println("�������� B");
		double num2=sc.nextDouble();
		System.out.println("�������� C");
		double num3=sc.nextDouble();
		if(((num3<num1)&&(num3<num2))||((num3>num1)&&(num3>num2)))
		{	
		}
		else{
			System.out.println("������� "+num1+" � ����� "+num2+" � "+num3);
		}

		
		

	}

}
