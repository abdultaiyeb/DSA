package OtherDSA;

import java.util.*;

//Java program to print the Fibonacci series
public class FibonacciSeries {	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number between 0 and 20");
		int number= sc.nextInt();
		long a=0,b=1;
		
		for(int i=0;i<number;i++) {
			System.out.print(a +" ");
			long next= a+b;
			a=b;  
			b=next;
		}
	}
}
