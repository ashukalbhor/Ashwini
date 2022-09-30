package java1;

public class Lager {
	public static void main(String[] args) {
		int a = 24;
		int b = 45;
		int c = 56;
		int d = 76;
		
		
		if (a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println("a is greater");
					System.out.println(a);
					
				}
				else
				{
					System.out.println("d is greater");
					System.out.println(d);
					
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println("c is greater");
					System.out.println(c);
				}
				else
				{
					System.out.println("d is greater");
					System.out.println(d);
				}
			}
		}
			else
			{
				if(b>c)
				{
					if(b>d)
					{
						System.out.println("b is greater");
						System.out.println(b);
					}
					else
					{
						System.out.println("d is greater");
						System.out.println(d);
					}
				}
				else
				{
					if(c>d)
					{
						System.out.println("cis greater");
						System.out.println(c);
					}
					else
					{
						System.out.println("d is greater");
						System.out.println(d);
					}
				}
			}
		}
	}


