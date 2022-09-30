package cast;

public class Execution {
	public static void main(String[] args) {
		Pune d= new Pune();//object of superclass
		d.test();
		
		Mumbai e= new Mumbai();//object of sub class
		e.test();
		e.demo();//new object
		
		Pune upcast =new Mumbai(); /// up casting
		upcast.test();
		//upcast.demo();//new object cannot be upcast
	}

}
