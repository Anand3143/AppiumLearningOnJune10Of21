package practiceJava;

public class StaticAndNonStatic {
	
	static int a= 10;
	int b=100;
	static void st()
	{
		System.out.println("Static method");
	}
	void nst()
	{
		System.out.println("Non static method");
	}
	public static void main(String[] args) {
		
		int a=50;
		System.out.println(a);
		st();
		StaticAndNonStatic snst = new StaticAndNonStatic();
		snst.b=200;
		System.out.println(snst.b);
		snst.nst();
	}

}
