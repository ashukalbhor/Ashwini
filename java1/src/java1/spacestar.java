package java1;

public class spacestar {
	public static void main(String[] args) {
		
	
	int line = 10;
	for(int a = 1 ; a<=line ; a++)
	{
		for(int b =(line-1) ; b>=a; b-- )
		{
			System.out.print(" ");
			
		}
		for(int b = 1 ; b<=a ; b++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	for(int a = 9 ; a>=1 ; a--)
	{
		for(int b =(9-1) ; b>=a; b-- )
		{
			System.out.print("");
			
		}
		for(int b = 1 ; b<=a ; b++)
		{
			System.out.print("*");
		}
		System.out.println();
	
		
	}	

}
}
