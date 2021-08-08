package basicPrograms;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4; i>=1; i--) //outer loop
		{
			for(int j=1; j<=i; j++)//inner loop
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		int a =1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(a);
			}
			a=a+1;
			System.out.println();
		}
		int b=5;
		for(int i=5; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(b);
			}
			b=b-1;
			System.out.println();
		}
	}

}
