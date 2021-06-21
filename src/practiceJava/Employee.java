package practiceJava;

public class Employee {
	
	int eid;
	String ename;
	int Sal;
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(Sal);
	}
	 void bonus()
	{
		System.out.println(Sal*10/100);
	}
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.eid = 100;
		emp1.ename= "Anand";
		emp1.Sal=1000;
		emp1.display();
		emp1.bonus();
	}

}
