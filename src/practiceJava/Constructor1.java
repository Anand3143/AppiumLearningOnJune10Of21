package practiceJava;

public class Constructor1 {

	int sid;
	String sname;
	char sg;
	
	Constructor1(int id, String name, char g)
	{
		sid=id;
		sname=name;
		sg=g;
	}
	void display()
	{
		System.out.println(sid+" "+sname+" "+sg);
	}
	public static void main(String[] args) {
		
		Constructor1 c1 = new Constructor1(100, "Anand", 'A');
		c1.display();
	}


}