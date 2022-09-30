package java1;

public class Amrstrong {
	public static void main(String[] args) {
		int n=153;   
		
		int sum=0;
		int r=0;
		for(int i=n;i>0;i=i/10) 
		{
			r=(i%10);
			
			sum = sum+(r*r*r);
			
		}
		if(n==sum)
		{
		System.out.println("it is an amr");
		}
		else
		{
			System.out.println("it is an  not amr");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n = 153;
//		int c=n;
//		int sum=0;
//		int a;
//		while(n>0)
//		{
//			a=n%10;
//			n=n/10;
//			sum = sum+a*a*a;
//			
//			
//		}
//		if(c==sum)
//		{
//			System.out.println(" a is a armstrong");
//		}
//		else
//		{
//			System.out.println("a is not srmstrong");
//		}
	}

}
