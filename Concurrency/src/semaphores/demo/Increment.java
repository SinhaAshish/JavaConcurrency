package semaphores.demo;

import java.util.concurrent.Semaphore;

public class Increment implements Runnable{
	
	String name;
	Semaphore sem;
	Increment(String name, Semaphore sem){
		this.name= name;
		this.sem=sem;
		new Thread(this).start();
	}
	@Override
	public void run() {
		System.out.println(name+" is waiting for permit ");
		
		try{
			sem.acquire();
			for( int i=0;i<5 ;i ++)
			{
				Shared.count++;
				System.out.println(name+ "   "+Shared.count);
			}
		}
		catch( InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println(name+" is releasing for permit ");
		sem.release();
		
		
	}
	

}
