package String;

public class StringBufferEx
{
	public static void main(String[] args) 
	{	
       StringBuffer sb=new StringBuffer("marlabs");
       int a=sb.length();
       System.out.println(sb);
       System.out.println(a);
       /*sb.reverse();
       System.out.println(sb);*/
       sb.insert(4, "hello");
       System.out.println(sb);
       sb.insert(2, 5);
       System.out.println(sb);
       sb.insert(3, true);
       System.out.println(sb);
       sb.insert(5, 34.589d);
       System.out.println(sb);
       sb.insert(4, 12.87f);
       System.out.println(sb);
       sb.delete(2, 6);
       System.out.println(sb);
       sb.deleteCharAt(5);
       System.out.println(sb);
       sb.replace(4, 9, "abcd");
       System.out.println(sb);
       char z[]= {'w','e','l','c','o','m','e'};
       sb.insert(0, z);
       System.out.println(sb);
   }
}
