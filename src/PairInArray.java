
public class PairInArray {

	private static final int MAX = 1000;


	public static void pair(int a[], int sum)
	{
		boolean[] binheap=new boolean[MAX];
		
		for(int i=0;i<a.length;i++)
		{
			int temp=sum-a[i];
			if(temp>=0 && binheap[temp])
			{
				System.out.println("pair with given sum"+sum+"is"+a[i]+","+temp);
			}
			binheap[a[i]]=true;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]={2,4,8,5,13,15};
		int n=12;
		pair(A,n);
		
		

	}

}
