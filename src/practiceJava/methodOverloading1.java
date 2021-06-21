package practiceJava;

public class methodOverloading1 {
	
	public int m1(int var1, int var2)
	{
		System.out.println("M1 method");
		return (var1+var2);	
	}
	public int m1(int a, int b, float c)
	{
		System.out.println("M2 method");
		return (a-b);
	}
	public static void main(String[] args) {
		
		methodOverloading1 mo = new methodOverloading1();
		mo.m1(20, 20);
		mo.m1(11, 9);
		//System.out.println(mo.m1(10, 40));
	}
	

}
