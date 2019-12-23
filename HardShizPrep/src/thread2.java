

class tc implements Runnable
{
	
	int tno,pulse;
	
	tc(int tno, int pulse)
	{
		this.tno=tno;
		this.pulse=pulse;
	}
	
	
	public void run()
	{
		while(true)
		{
			System.out.println("Thread "+tno+" with a pulse of: "+pulse+" running");
			try{
				Thread.sleep(pulse);
			}
			catch(InterruptedException e) {System.out.println("Some douche stopped it");}
		}
	}
	
	
}


public class thread2
{
	
	public static void main(String[] args)
	{
		Thread t1= new Thread(new tc(1,1100));
		Thread t2= new Thread(new tc(2,1700));
		Thread t3= new Thread(new tc(3,3000));
		t1.start();
		t2.start();
		t3.start();
		
		t1.interrupt();
		
	}
	
	
	
}
