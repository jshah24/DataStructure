
public class Unorderdpairofpositive {

	public void unordered(int a[], int m){
		
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
				if(count>m){
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
				
			}
			else
				count=1;
		
	System.out.println(a[i]);
		}
	}
	
	public static void main(String args[]){
		int arr[]={2,1,1,1,1,3,4,4,4,5};
		Unorderdpairofpositive u=new Unorderdpairofpositive();
		u.unordered(arr,2);
	}
	
}
