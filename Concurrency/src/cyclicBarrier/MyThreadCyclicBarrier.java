package cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThreadCyclicBarrier implements Runnable {
	CyclicBarrier cb ;
	
	MyThreadCyclicBarrier( CyclicBarrier cb)
	{
		this.cb=cb;
	}
	@Override
	public void run() {
		
	try{
	
			System.out.println( " Name "+ Thread.currentThread().getName() + " is waiting ");
		cb.await();
		System.out.println( " Name "+ Thread.currentThread().getName() + " is reached ");
		
	}
	catch( BrokenBarrierException bx)
	{
		System.out.println(bx);
	}
	catch( InterruptedException e)
	{
		System.out.println(e);
	}
	
	}
	
}
