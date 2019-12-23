/*class Prime{
	synchronized void displayPrime(int n)
	{
		int flag=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1&&n!=1)
			System.out.println(n);
	}
}
*/

class thread extends Thread
{
	int beg;
	int end;
	
	synchronized void displayPrime(int n)
	{
		int flag=1;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1&&n!=1)
			{
				System.out.println(n);
				try {
					Thread.sleep(200);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
	
	public thread(int beg,int end)
	{
		this.beg=beg;
		this.end=end;
	}
	
	public void run()
	{
		for(int i=beg;i<=end;i++)
		{
			displayPrime(i);
		}
	}
	
	
}


public class q5aThreadPrime {
	public static void main(String args[])
	{
		thread t1 = new thread(1,100);
		thread t2 = new thread(101,200);
		t1.start();
		t2.start();
	}
}
