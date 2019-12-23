import java.util.Scanner;


class NotEligibleException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	NotEligibleException(String s)
	{
		super(s);
	}
	
}


class LowAttendanceException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	LowAttendanceException(String s)
	{
		super(s);
	}
	
}



class LowMarksException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	LowMarksException(String s)
	{
		super(s);
	}
	
}




public class exc2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner cin=new Scanner(System.in);
		
		int m=cin.nextInt();
		float a=cin.nextFloat();
		NotEligibleException e= new NotEligibleException("This how getting detained boiii ");
		try {
		if(a<80.0)
		{
			e.initCause(new LowAttendanceException("Bunkerrr"));
			throw e;
		}
		else if(m<20)
		{
			e.initCause(new LowMarksException("Flunkerrr"));
			throw e;
		}
		}catch(NotEligibleException man)
		{
			System.out.print(man);
			System.out.print(man.getCause());
		}
		
		cin.close();

	}

}





