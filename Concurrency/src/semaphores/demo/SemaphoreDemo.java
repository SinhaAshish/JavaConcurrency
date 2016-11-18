package semaphores.demo;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore sem = new Semaphore(1);
		new Increment( "A",sem);
		new Decrement( "B",sem );
	}

}
