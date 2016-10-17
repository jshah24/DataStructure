import java.util.*;
public class StringCompression {
public static void main(String args[])
{

String s = "aabbcccddaaa";

StringBuffer sb = new StringBuffer();
int count=0;
char first=s.charAt(0);
for(int i=0;i<s.length();i++)
{
	
	char ch=s.charAt(i);
	if(first==ch)
	{
		count++;
		if(i==s.length()-1){
			sb.append(first);
			sb.append(count);
		}
		
	}
	else
	{
		sb.append(first);
		sb.append(count);
		first=ch;
		count=1;	
		
	}
	
	
}
System.out.println(sb);


/*HashMap<Character, Integer> map = new HashMap<Character, Integer>();

for (int i = 0; i <s.length() ; ++i)
{
    char ch = s.charAt(i);

    if (!map.containsKey(ch))
    {
        map.put(ch, 1);
    }
    else
    {
        map.put(ch, map.get(ch) + 1);
    }
}

System.out.println(map);	*/
}
	
}
