package basicPrograms;

public class palindrome {
	
	public static void main(String[] args) {
		
		int n =122;
		int r, sum=0, temp;
		temp=n;
		while(n>0)
		{
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;	
		}
		if(sum==temp)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
