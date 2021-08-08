package practiceJava;

import java.io.Console;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		int a,b;
		float c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value : ");
		a=sc.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter b value : ");
		b=sc2.nextInt();
		
		if(b==0)
		{
			System.out.println("Enter the b value other than zero ");
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter b value : ");
			b=sc3.nextInt();
		}
		
		c= a / b;
		System.out.println("Division of a and b is : "+c);
	}
}
