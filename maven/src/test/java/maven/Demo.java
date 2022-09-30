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

public class Demo {
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
		System.out.println("Before class");
		
	}
	@BeforeMethod
	public void mclass() {
		System.out.println("Before method");
		
	}
	@Test
	public void tclassA() {
		System.out.println("Test class A");
		
	}
	@Test
	public void tclassB() {
		System.out.println("Test class B");
		
	}
	@Test
	public void tclassC() {
		System.out.println("Test classC");
		
	}
	@Test
	public void tclassD() {
		System.out.println("Test class D");
		
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
