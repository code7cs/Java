package Inheritance;
// IS-A Relationship
class MarlabsStudent
{
	int stipend=10000; // Instance Variable
}
public class MarlabsEmployee extends MarlabsStudent
{
	float salary=95000; // Instance Variable
	public static void main(String[] args) 
	{
		MarlabsEmployee m=new MarlabsEmployee();
		System.out.println("Stipend is : "+m.stipend);
		System.out.println("Salary is : "+m.salary);
	}
}
