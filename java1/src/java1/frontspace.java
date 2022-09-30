package java1;

public class frontspace {
	 public static void main(String[] args) {
		 
	int line =6;
		 for(int a = line ; a>=1 ; a--)
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

		 
		 for(int a = 2 ; a<=line ; a++)
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
	 }
}
