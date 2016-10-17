
public class LargetsonRight {
	
	public static void largest(int a[]){
		int len=a.length;
		int max=a[len-1];
		a[len-1]=-1;
		
		for(int i=len-2;i>0;i--)
		{
			
			int temp=a[i];
			a[i]=max;
			if(max<temp)
			{
				max=temp;
			}
		}
	}
	
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a={16,17,3,4,5,2};
	largest(a);
	System.out.println("new");
	print(a);
	
	
		
	}

}
