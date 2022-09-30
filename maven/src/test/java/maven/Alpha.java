package maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alpha {
	@BeforeSuite
	public void bsuite() {
		System.out.println("Before suite");
		
	}
	@BeforeTest
	public void btest() {
		System.out.println("Before test");
		
	}
	
	@BeforeClass
	public void bclass() {
		System.out.println("Before class ");
		
	}
	@BeforeMethod
	public void mclass() {
		System.out.println("Before method ");
		
	}
	@Test
	public void tclass() {
		System.out.println("Test class");
		
	}
	@Test
	public void tclass1() {
		System.out.println("Test class 1");
		
	}
	@Test
	public void tclass2() {
		System.out.println("Test class 2");
		
	}
	@Test
	public void tclass3() {
		System.out.println("Test class  3");
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
		
	}

	@AfterClass
	public void afterclass() {
		System.out.println("After class");
		
	}
	@AfterTest
	public void atest() {
		System.out.println("After test");
		
	}
	@AfterSuite
	public void asuite() {
		System.out.println("After suite");
	}
	
	

}
