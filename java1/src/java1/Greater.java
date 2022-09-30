package java1;

public class Greater {
	public static void main(String[] args) {
		int a = 23;
		int b = 34;
		int c = 46;
		if (a>b)
		{
			if(a>c)
			{
				System.out.println("a is greater");
				System.out.println(a);
				
			}
			else
			{
				System.out.println("c ic greayer");
				System.out.println(c);
				
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is greater");
				System.out.println(b);
				
			}
			else
			{
				System.out.println("c is greater");
				System.out.println(c);
			}
		}
	}

}
