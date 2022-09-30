package castabs;

public class Indell implements Inter{

	
	
	public void test() {
		System.out.println("sub class");
		
	}
	public static void main(String[] args) {
		 Indell x= new Indell();
		 x.test();  //object of sub class
		 
		 
		 Inter d= new Indell();
		 d.test();   //object of upcasting
		 
		 
	}

}
