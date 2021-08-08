package practiceJava;

public class TryCatch {

	public static void main(String[] args) {
		
		try{
			
			int a=10;
			int b=0;
			float c = a / b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("code executed");
		}
	}
}
