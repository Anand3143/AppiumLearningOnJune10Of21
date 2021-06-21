package practiceJava;

 class A {
	
	 static int a = 10;
	static void parent()
	{
		System.out.println("Parent class");
		System.out.println("parent class variable" +a);
	}
}
	public class B extends A
	{
		static int a =100;
		
	static	void parent()
		{
			System.out.println("Child class");
			System.out.println("child class variable" +a);
		}
	
	public static void main(String[] args) {
		
		A sm = new B();
		sm.parent();
		
		System.out.println(a);
		
		
	}

}