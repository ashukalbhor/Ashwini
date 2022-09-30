package java1;

public class Palindrome {
	public static void main(String[] args) {
		int n=456;
		int sum=0;
		int r;
		for(int i=n;i>0;i=i/10)
			
		{
			r= i%10;
			
			sum = (sum*10)+r;
			
		}
	
		
		if(n==sum) {
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}

}
