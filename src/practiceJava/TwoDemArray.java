package practiceJava;

public class TwoDemArray {

	public static void main(String[] args) {
		
		int a[] = new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a.length);
		int b[]={1,2,3,4,5,6,7};
		System.out.println(b[3] + " " + b.length);
		int c[][] = new int [3][2];
		c[0][0]=100;
		c[0][1]=200;
		
		c[1][0]=300;
		c[1][1]=400;
		
		c[2][0]=500;
		c[2][1]=600;
		System.out.println(c[2][0]);
		for (int i=0; i<c.length; i++)
		{
			for (int j=0;j<c[i].length; j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
	}
}
