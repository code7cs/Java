package Array;

public class Arr3 
{
	public static void main(String[] args) 
	{
		int x[][]= {{1,2,3},{2,3,4},{3,4,5}};
		
		// By Using For Loop
		
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println("");
		}*/
		
		// By Using For-Each Loop
		
		for(int a[]:x)
		{
			for(int b:a)
			{
				System.out.print(b+" ");
			}
			System.out.println("");
		}
  	 }
}
