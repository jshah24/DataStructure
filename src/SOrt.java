import java.util.Arrays;


public class SOrt {
	public static void main(String []args){
		int a[]={2,7,17,0,0,0,0};
		int[] b={5,8,12,14};
		int Alength=0;
		for(int i=0;i<a.length;i++){
			if(a[i]!=0){
				Alength++;
			}
		}
		Alength=Alength-1;
		int Blength = b.length-1;
		int x=a.length-1;
		while(Alength>=0 && Blength>=0)
		{
			if(a[Alength]>b[Blength]){
				
					a[x]=a[Alength];
				
				Alength--;
				x--;
			 
			}
			else{
				
					a[x]=b[Blength];
				
					Blength--;
				
				x--;
			}
			
		}
		if(Alength>=0){
			while(Alength>=0){
				a[x]=a[Alength];
				Alength--;
				x--;
			}
			
		}
		
		if(Blength>=0){
			while(Blength>=0){
				a[x]=b[Blength];
				Blength--;
				x--;
			}
			
		}
		System.out.println(Arrays.toString(a));
		
		
	}
	

}
