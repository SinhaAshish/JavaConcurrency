package semaphores.producerconsumer;

import java.util.concurrent.Semaphore;

public class Shared {
	int n;
	
	static Semaphore semCon=new Semaphore(0);
	static Semaphore semProd=new Semaphore(1);
	
	public void get()
	{
		try{
			semCon.acquire();
			
		}
		catch(InterruptedException e){ 
			System.out.println(e);
		}
		System.out.println( " Got "+n);
		semProd.release();
	
	}
	public void put(int n)
	{
		try{
			semProd.acquire();			
		}
		catch(InterruptedException e){ 
			System.out.println(e);
		}
		this.n=n;
		System.out.println( " Put "+n);
		semCon.release();
	}
}
