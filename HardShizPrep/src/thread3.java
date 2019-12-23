

class printing
{
	
	synchronized void pjava() throws InterruptedException
	{
		while(true)
		{
			System.out.print("Java ");
			wait();
			notify();
		}
		
	}
	
	
	synchronized void pprog() throws InterruptedException
	{
		while(true)
		{
			System.out.print("Programming\n");
			notify();
			wait();
		}
	}
	
	
}




public class thread3 {

	public static void main(String[] args)
	{
		final printing p=new printing();
		
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				try {
					p.pjava();
				}catch(InterruptedException e) {}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run()
			{
				try {
					p.pprog();
				}catch(InterruptedException e) {}
			}
		});
		
		
		t1.start();
		t2.start();
		
	}

}
