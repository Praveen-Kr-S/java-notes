package Learn_threads;

class fire extends Thread{
	public void run() {
		System.out.println("Fire Mode is ON...");
	}
}

public class Single_thread {
	
	public static void main(String[] args) {
		
		fire f = new fire();
		f.start();

		
	}
	
	
	

}
