import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        System.out.print("Enter number upto which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();
 
        System.out.println("\n\nFibonacci series upto " + number +" numbers : ");
        for(int i=1; i<=number; i++){
            System.out.print(fibonacciLoop(i) +" ");
        }
    } 
    public static int fibonacciLoop(int number){
    
        if(number == 2 ){
            return 1;
        }
        if(number == 1 ){
            return 0;
        }
        int fibo1=0, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
       
 
        }
        return fibonacci; //Fibonacci number
    }     
}