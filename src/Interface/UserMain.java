package Interface;
interface Car
{
	void setName(String a);
	String getName();
	void setGears(int b);
	int getGears();
	void setMileage(int c);
	int getMileage();
}
class Santro implements Car
{
	String a;
	int b,c;
	public void setName(String a)
	{
		this.a=a;
	}
	public String getName()
	{
		return a;
	}
	public void setGears(int b)
	{
		this.b=b;
	}
	public int getGears()
	{
		return b;
	}
	public void setMileage(int c)
	{
		this.c=c;
	}
	public int getMileage()
	{
		return c;
	}
}
class Alto implements Car
{
	String a;
	int b,c;
	public void setName(String a)
	{
		this.a=a;
	}
	public String getName()
	{
		return a;
	}
	public void setGears(int b)
	{
		this.b=b;
	}
	public int getGears()
	{
		return b;
	}
	public void setMileage(int c)
	{
		this.c=c;
	}
	public int getMileage()
	{
		return c;
	}
}
public class UserMain 
{
	public static void main(String[] args) 
	{
		Santro s=new Santro();
		s.setName("ABCD");
		s.setGears(5);
		s.setMileage(16);
		System.out.println("Santro Car Details are : ");
		System.out.println("Car Name is : "+s.getName());
		System.out.println("Car Gears are : "+s.getGears());
		System.out.println("Car Mileage is : "+s.getMileage());
		System.out.println("----------------------------");
		Alto a=new Alto();
		a.setName("XYZ");
		a.setGears(6);
		a.setMileage(18);
		System.out.println("Alto Car Details are : ");
		System.out.println("Car Name is : "+a.getName());
		System.out.println("Car Gears are : "+a.getGears());
		System.out.println("Car Mileage is : "+a.getMileage());
	}
}
