package inher;

public class executionclass {
	public static void main(String[] args) {
		ashu x = new ashu();
		tanu y = new tanu();
		sonu z = new sonu();
		// normal call//
		System.out.println(ashu.a);
		System.out.println(x.b);
		
		// Inheritance call
		System.out.println(tanu.a);
		System.out.println(y.b);
		System.out.println(y.c);//normal call
		
		System.out.println(sonu.a);
		System.out.println(z.b);
		//System.out.println(z.c);
		System.out.println(z.d);// normal call
		
	}

}
