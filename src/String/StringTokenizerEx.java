package String;

import java.util.StringTokenizer;

public class StringTokenizerEx 
{
	public static void main(String[] args) 
	{
		StringTokenizer st=new StringTokenizer("my%name#is%nagendra","%#");
		// " "----> DELIMETER
		System.out.println(st.countTokens());
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	}
}
