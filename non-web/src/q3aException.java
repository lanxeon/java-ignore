
class NameNotCorrect extends Exception
{
	NameNotCorrect(String e)
	{
		super(e);
	}
}

class AgeLimitException extends Exception
{
	AgeLimitException(String e)
	{
		super(e);
	}
}

public class q3aException {
	public static void main(String[] args) {
	try {
		throw new AgeLimitException("Age Limit Not Reached");
	}
	catch(AgeLimitException e)
	{
		System.out.print(e);
	}
  }
}
