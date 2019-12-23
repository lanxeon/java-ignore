

class prime extends Thread
{
	public void run()
	{
		int flag=0;
		try
		{
			for(int i=2;i<=100;i++)
				{
				flag=0;
				for(int j=2;j<i;j++)
				if(i%j==0 || i==2)
				{flag=1; break;}
				
				if(flag==0)
				{
					System.out.println("prime: "+i);
					Thread.sleep(500);
				}
				}
		}
		catch(Exception e)
		{}
	}
}




class div extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=100;i++)
				if((i%2==0)&&(i%4==0)&&(i%6==0))
					{
					System.out.println("Divisible: "+i);
					Thread.sleep(500);
					}
		}catch(Exception e){}
	}
}





public class thread1 {

	public static void main(String[] args) 
	{
		/*
		Thread t1=new prime();
		Thread t2=new div();
		t1.start();
		t2.start();
		*/
		
		new prime().start();
		new div().start();
	}

}
