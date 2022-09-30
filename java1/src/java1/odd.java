package java1;

public class odd {
	public static void main(String[] args) {
		
         System.out.print("even no:-");
         
		for (int i = 1; i < 50;  i ++)
		{
			if(i%2!=0)
			{
			System.out.print(i+" ");	
		}
		}
		System.out.println();
		
		System.out.print ("odd no:");
		for (int i = 1; i < 50; i = i + 2) 
		{
			System.out.print(i +" ");
		}
	}

}
