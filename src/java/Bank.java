package java;

public class Bank {
	
void accountOpenningFees()
{
System.out.println("Fees is 500");	
}
}

class SBI extends Bank
{
	void accountOpenningFees()
	{
	System.out.println("Fees is 1000");	
	}
	
}
class HDFC extends Bank
{
	void accountOpenningFees()
	{
	System.out.println("Fees is 5000");	
	}
	
}
class ICIC extends Bank
{
	void accountOpenningFees()
	{
	System.out.println("Fees is 10000");	
	}
	
}
class KotakMahindra extends Bank
{
	void accountOpenningFees()
	{
	System.out.println("Fees is 0");	
	}
	
}

//Car --Speed(100)
// Tata--Speed(150)
//F! -->Speed(500)
//NANo -->Speed(50)



