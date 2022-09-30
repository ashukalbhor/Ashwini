package castabs;

public  class Nagar extends Goa {

	
public	 void test() {
		System.out.println("sub class");
		
	}



public static void main(String[] args) {
	//Goa x= new Goa();// object of abstract class
	Nagar t= new Nagar();
	t.test();// object of sub class
	
	Goa d = new Nagar();// object of upcasting
	
	d.test();
}

}
