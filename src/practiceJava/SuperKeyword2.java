package practiceJava;

class ABC{

public void mymethod()

{

System.out.println("Class ABC: mymethod()");

}

}

class SuperKeyword2 extends ABC{

public void mymethod(){

//This will call the mymethod() of parent class

super.mymethod();

System.out.println("Class Test: mymethod()");

}

public static void main( String args[]) {

SuperKeyword2 obj = new SuperKeyword2();

obj.mymethod();

}
}