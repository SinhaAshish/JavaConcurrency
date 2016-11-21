package cyclicBarrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclicBarrier cb = new CyclicBarrier(3 , new BarrierAction());
		Thread t1= new Thread( new MyThreadCyclicBarrier(cb), "A");
		Thread t2= new Thread( new MyThreadCyclicBarrier(cb), "B");
		Thread t3= new Thread( new MyThreadCyclicBarrier(cb), "C");
	
		
		t1.start();
		t2.start();
		t3.start();
	}

}
