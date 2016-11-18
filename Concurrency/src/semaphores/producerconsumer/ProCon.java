package semaphores.producerconsumer;

public class ProCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Shared sh = new Shared();
		  new Consumer(sh);
		  new Producer(sh);
		  
			}

}
