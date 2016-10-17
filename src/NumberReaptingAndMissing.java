import java.util.*;
public class NumberReaptingAndMissing {
	public static void main(String[] args) {
	
	int a[]={1,2,3,3,5,6,7};
	int n=a.length;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for (int i=0;i < a.length;i++)
        {
          
            if(hm.containsKey(a[i]))
            {
                
             hm.put(  a[i] ,  hm.get(i +1 ));
            }
            else
            {
                hm.put( a[i] , 1 ) ;
            }
            
            if(hm.get(a)>1)
			{
				
			System.out.println(hm.get(a));
		}
    		
	}
		int sum=0;
		int x=(n*(n-1))/2;
		for(int j=0;j<a.length;j++)
		{
			sum+=a[j];
		
        }
		int result=x-sum;
		//System.out.println(result);
		
	}


		// TODO Auto-generated method stub

	}


