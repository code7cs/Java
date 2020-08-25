package HashCode;

public class HashCodeEx 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		String s2="hello";
		String s3="Hello";
		String s4="ABCDEFG";
		String s5=s4;
		System.out.println("S1 HasCode is : "+s1.hashCode());
		System.out.println("S2 HasCode is : "+s2.hashCode());
		System.out.println("S3 HasCode is : "+s3.hashCode());
		System.out.println("S4 HasCode is : "+s4.hashCode());
		System.out.println("S5 HasCode is : "+s5.hashCode());
		System.out.println("Aa String is : "+"Aa".hashCode());
		System.out.println("BB String is : "+"BB".hashCode());
		// Collision and it will Occur in Rare Case
		System.out.println("Dd String is : "+"Dd".hashCode());
		System.out.println("FF String is : "+"FF".hashCode());
		System.out.println("Pp String is : "+"Pp".hashCode());
		System.out.println("QQ String is : "+"QQ".hashCode());
		System.out.println("Gg String is : "+"Gg".hashCode());
		System.out.println("II String is : "+"II".hashCode());
		
		System.out.println("AA String is : "+"AA".hashCode());
	}
}
