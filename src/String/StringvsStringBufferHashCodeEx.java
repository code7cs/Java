package String;

public class StringvsStringBufferHashCodeEx
{
	public static void main(String[] args) 
	{
		String s1="mar";
		System.out.println(s1.hashCode());
		s1=s1+"labs";
		System.out.println(s1.hashCode());
		StringBuffer sb=new StringBuffer("mar");
		System.out.println(sb.hashCode());
		sb.append("labs");
		System.out.println(sb.hashCode());
		System.out.println(sb);
	}
}
