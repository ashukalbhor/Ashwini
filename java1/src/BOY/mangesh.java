package BOY;

public class mangesh {
public	mangesh()
	{
		System.out.println("hi");
	}
	mangesh(char c)
	{
		System.out.println("hello");
	}
private	mangesh(int x)
	{
		System.out.println("velocity");
	}
protected 	mangesh(int a, int b)
	{
		System.out.println("pune");
	}
	public static void main(String[] args) {
		new mangesh();
		new mangesh('@');
		new mangesh(5);
		new mangesh(3,4);
		
	}

}
