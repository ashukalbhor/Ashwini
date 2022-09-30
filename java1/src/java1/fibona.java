package java1;

public class fibona {
	public static void main(String[] args) {
		
	
	int a1=0;
	int a2=1;
	int a3 ; 
	System .out.print(a1+" "+a2);
	for(int b =2;b<10;b++)
	{
		a3 = a1+a2;
		System.out.print(" "+a3);
		a1=a2;
		a2=a3;
	}
	
}
}