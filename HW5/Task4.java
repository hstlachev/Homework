import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two names");	
		String text=sc.nextLine();
		String[] words=text.split(",");
		String first=words[0];
		String second=words[1];
		int lenghtOfFirst = first.length();
		int lenghtOfSecond = second.length();
		int sum1=0;
		int sum2=0;
		for(int index=0;index<lenghtOfFirst;index++){
			sum1+=(int)first.charAt(index);
		}
		for(int index=0;index<lenghtOfSecond;index++){
			sum2+=(int)second.charAt(index);
		}
		if(sum1>sum2){
			System.out.println(first);
		}
		if(sum1<sum2){
			System.out.println(second);
		}
		if(sum1==sum2){
			System.out.println("Стойностите са равни.");
		}
	}
}

