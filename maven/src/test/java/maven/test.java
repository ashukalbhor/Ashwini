package maven;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	public class Testng {
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("before class");
		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("before method");
		}
		@Test
		public void test()
		{
			System.out.println("Testa");
		}
		}

}
