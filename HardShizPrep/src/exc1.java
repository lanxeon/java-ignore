

class DailyTransactionLimitException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DailyTransactionLimitException(String s)
	{
		super(s);
	}
}


class InsufficientAmountException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InsufficientAmountException(String s)
	{
		super(s);
	}
}


class bank
{
	int balance;
	
	bank(int x)
	{
		balance=x;
	}
	
	void withdraw(int y) throws InsufficientAmountException, DailyTransactionLimitException
	{
		if(y>25000)
			throw new DailyTransactionLimitException("daily limit exceeded");
		
		else if(y>balance)
			throw new InsufficientAmountException("You broke nigga");
		
		else
			System.out.println("Withdrawal successful");
	}
}

public class exc1 {
	
	public static void main(String[] args)
	{
		bank x=new bank(50000);
		bank y=new bank(1900);
		
		try {
			x.withdraw(27000);
		}catch(DailyTransactionLimitException e)
		{
			System.out.println(e);
		}
		
		catch(InsufficientAmountException i)
		{
			System.out.println(i);
		}
		
		
		try {
			y.withdraw(2000);
		}catch(DailyTransactionLimitException e)
		{
			System.out.println(e);
		}
		
		catch(InsufficientAmountException i)
		{
			System.out.println(i);
		}
		
		
	}

}
