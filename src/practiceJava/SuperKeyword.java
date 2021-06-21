package practiceJava;

public class SuperKeyword {

	
	String color = "White";
	
}
class Dog extends SuperKeyword
	{
		String color = "Black";
		void displayColor()
		{
			System.out.println(color);
			System.out.println(super.color);
		}
	}
class testSuper
{
	public static void main(String[] args) {
		Dog d = new Dog();
				d.displayColor();
	}
}
