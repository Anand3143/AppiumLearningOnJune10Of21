package practiceJava;

public class Arrays1 {

	public static void main(String[] args) {
		
		int a[] = new int [5];
		System.out.println(a.length);
		int b[][] = new int [2][3];
		System.out.println(b.length);
		for(int i=1;i<=a.length;i++)
		{
			int c = (a[i]+a[i]);
			System.out.println(c);
		}
		
	}
}
