
public class LeaderElement {
	public static void main(String []args)
	{
		int[] a={1,2,3,4,3,1};
		int right=a.length-1;
		System.out.println(a[right]);
		
		for(int i=(a.length-1-1);i>=0;i--)
		{
			if(a[right]<a[i])
			{
				System.out.println(a[i]);
				right=i;
			}
		}
	
		
		}
	}


