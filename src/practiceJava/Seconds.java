package practiceJava;

import java.util.Scanner;

public class Seconds {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer number in seconds: ");
		
		int seconds = sc.nextInt();
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		int hours = minutes / 24;
		int days = hours / 30;
		int months = days / 12;
		System.out.println(seconds+ " seconds is equal to " + minutes + " minutes and " + remainingSeconds+ " seconds");
		System.out.println(hours);
		System.out.println(days);
		System.out.println(months);
	}

}
