package Learn_threads;

public class Priority_Threads extends Thread {
	
	public void run() {
		System.out.println("Thread Excecuted ->"+Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		Priority_Threads t1 = new Priority_Threads();
		Priority_Threads t2 = new Priority_Threads();
		Priority_Threads t4 = new Priority_Threads();
		
		t1.setPriority(10);
		t4.setPriority(6);
		t2.setPriority(1);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t4.getPriority());
		
		t1.start();
		t2.start();
		t4.start();
		
		
		
		
		
		
		
	}

}
