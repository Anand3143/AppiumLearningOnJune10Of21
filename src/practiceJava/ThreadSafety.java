package practiceJava;

public class ThreadSafety {

	private volatile int myInt = 0;
	public synchronized int addOne()
	{
		int temp = myInt;
		temp = temp +1;
		myInt = temp;
		System.out.println(temp);
		return temp;
		
	}
	public static void main(String[] args) {
		 ThreadSafety ts = new ThreadSafety();
		ts.addOne();
	}
}
