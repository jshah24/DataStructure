
public class Rearrangearray {
	
	public static void  reaarange(int a[], int n)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]+=(a[a[i]]%n)*n;
			
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]/=n;
		}
	


	    for (int i = 0; i < n; i++)
	        System.out.println( a[i]);
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={3,2,0,1};
		Rearrangearray r=new Rearrangearray();
		reaarange(a,4);
		

	}

}
