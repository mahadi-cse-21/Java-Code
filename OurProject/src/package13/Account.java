package package13;

public class Account {
	private int amount ;
	void addmoney(int a)
	{
		amount=amount+a;
		System.out.println("Total Amount = "+amount);
	}
	void withdraw(int a)
	{
		amount=amount-a;
		System.out.println("Total Amount = "+amount);
	}

}
