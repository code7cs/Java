package Encapsulation;

public class Consultant
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.setAccono(12345);
		b.setBankname("BOC");
		b.setIfsccode("BOC00789");
		System.out.println("Account Number is : "+b.getAccono());
		System.out.println("Bank Name is : "+b.getBankname());
		System.out.println("IFSC Code is : "+b.getIfsccode());
	}
}
