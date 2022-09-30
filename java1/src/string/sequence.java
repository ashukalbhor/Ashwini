package string;

public class sequence {
	public static void main(String[] args) {
		String a= "I am ashu";
		int b= a.length();
		 String c [] =a.split(" ");
		
		System.out.println(b);
		for(int i=0;i<c.length;i++)//12
		{
		for(int j=c[i].length()-1;j>=0;j--)//I ma uhsa
		{
			System.out.print(c[i].charAt(j));
			
		}
		System.out.print(" ");
			
	}
		
}
}
   