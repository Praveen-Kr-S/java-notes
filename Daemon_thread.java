package Learn_threads;

public class Daemon_thread extends Thread {
	
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Damemon Thread.....");
		}
		else {
			System.out.println("Main Thread........");
		}
	}

	public static void main(String[] args) {
		
		Daemon_thread t1 = new Daemon_thread();
		Daemon_thread t2 = new Daemon_thread();
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		

	}

}
