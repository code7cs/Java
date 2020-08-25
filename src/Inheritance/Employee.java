package Inheritance;
// HAS-A Relationship (without "extends" keyword---> Referring Objects Entity)
public class Employee 
{
    int eid;
    String ename;
    Bank bank;
    
	public Employee(int eid, String ename, Bank bank) 
	{
		this.eid = eid;
		this.ename = ename;
		this.bank = bank;
	}
	void f1()
	{
		System.out.println(eid+" "+ename);
		System.out.println(bank.accno+" "+bank.bname+" "+bank.ifsccode);
	}

	public static void main(String[] args)
	{
		Bank b1=new Bank(101,"BOC","BOC9032"),b2=new Bank(102,"BOI","BOI9034");
		Employee e1=new Employee(123,"E Ma",b1),e2=new Employee(234,"Siddharth",b2);
		e1.f1();
		e2.f1();
	}
}
