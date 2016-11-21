package counDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch cdl = new CountDownLatch(5);
		new MyThread(cdl);
		try{
			cdl.await();
		}
		catch(InterruptedException e)
		{ 
			System.out.println(e);
		}
		System.out.println(" The main is done");
	}

}
