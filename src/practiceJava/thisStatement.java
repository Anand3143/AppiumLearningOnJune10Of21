package practiceJava;

public class thisStatement {

	thisStatement(int a)
	{
		//this(99.00);
		System.out.println("this is an integer");
	}
	thisStatement(char b)
	{
		this(10);
		System.out.println("this is a character");
	}
	thisStatement(double c)
	{
		
		System.out.println("this is a double");
	}
			
	public static void main(String[] args) {
		
		System.out.println("this() calling statement");
		thisStatement tis = new thisStatement('D');
		
	}
}
