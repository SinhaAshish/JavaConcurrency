package semaphores.producerconsumer;


public class Consumer implements Runnable{
	Shared sh ;
	public Consumer(Shared sh) {
		this.sh=sh;
		new Thread(this, " Consumer").start();
	}
	@Override
	public void run() {
		
			for(int i=0; i<10; i++)
			{
				sh.get();
			}
	}
	
}