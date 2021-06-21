package practiceJava;

 class methodOverriding1 {
	
	protected void m1()
	{
		System.out.println("Main class");
	}
}
	class mO2 extends methodOverriding1
	{
		public void m1()
		{
			System.out.println("child class");
		}
	
	public static void main(String[] args) {
		
		mO2 mm = new mO2();
		mm.m1();
	}

}
