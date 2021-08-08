package practiceJava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnOrder {

	@Test
	void test1()
	{
		System.out.println("@Test2");
	}
	@Test
	void test2()
	{
		System.out.println("@Test1");
	}
	
	@BeforeSuite
	void test3()
	{
		System.out.println("@BeforeSuite");
	}
	@AfterClass
	void test4()
	{
		System.out.println("@AfterClass");
	}
	@BeforeTest
	void test5()
	{
		System.out.println("@BeforeTest");
	}
	@AfterTest
	void test6()
	{
		System.out.println("@AfterTest");
	}
	@BeforeClass
	void test7()
	{
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	void test8()
	{
		System.out.println("@BeforeMethod");
	}
	@AfterMethod
	void test9()
	{
		System.out.println("@AfterMethod");
	}
	@BeforeGroups
	void test10()
	{
		System.out.println("@BeforeGroups");
	}
	@AfterGroups
	void test11()
	{
		System.out.println("@AfterGroups");
	}
	
	@AfterSuite
	void test12()
	{
		System.out.println("@AfterSuite");
	}
	public static void main(String[] args) {
		
		
	}
}
