package basicPrograms;

public class Fibonocci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c, count=20;
		System.out.print(a+ " " +b);
		for(int i=0;i<count;i++)
		{
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}
	}
}
