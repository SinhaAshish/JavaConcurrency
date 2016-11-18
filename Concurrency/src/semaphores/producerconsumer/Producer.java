package semaphores.producerconsumer;

public class Producer implements Runnable{
	Shared sh ;
	public Producer(Shared sh) {
		this.sh=sh;
		new Thread(this, " Producer").start();
	}
	@Override
	public void run() {
	
			for(int i=0; i<10; i++)
			{
				sh.put(i);
			}
		
		
	}
	
}
