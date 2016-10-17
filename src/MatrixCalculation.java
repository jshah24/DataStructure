import java.util.Arrays;
public class MatrixCalculation {
public static void main(String[] args) {
int M[][] =new int [][]{
{0,1,1,0}, 
{1,1,1,0}, 
{1,1,1,1} , 
{1,1,1,1}};
setZero(M);
}
public static void setZero(int M[][])
{
	boolean rows [] = new boolean[M.length];
	boolean columns[] = new boolean[M[0].length];
	for(int i = 0; i < M.length; i++)
	{
		for(int j = 0; j < M[i].length; j++)
		{
			if(M[i][j] == 0 )
			{
				rows[i] = true;
				columns[j] = true;
			}
		}
}
	for(int i = 0; i < M.length; i++)
	{

		for(int j = 0; j < M[i].length ; j++)
		{
			if(rows[i] || columns[j])
			{
				M[i][j] = 0;
			}
		}
	}	
System.out.println(Arrays.deepToString(M));
}
}