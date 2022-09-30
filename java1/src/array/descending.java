package array;

public class descending {

	public static void main(String[] args) {
		int a[] = {67,56,78,90,34};
		int size =a.length;
		
		for(int i=0; i<size; i++)
		{
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<a[i])
				{
					int c =a[i];
					a[i]=a[j];
					a[j] = c;
					
				}
			}
			
			
			
				System.out.println(a[i]+ " ");
			
		
		}
		
	}

}
