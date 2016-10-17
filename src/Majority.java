import java.util.*;

public class Majority{

     public static void main(String []args){
         int[] a={1,2,3,3,3,2,2,2,1,2,5};
         HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
         int i;
         for( i=0;i<a.length;i++)
         {
             if(!map.containsKey(a[i]))
            {
                map.put(a[i],1);
                
            }
            else
            map.remove(a[i]);
         }
         
         
      System.out.println(map);
     }
}

