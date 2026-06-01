package Learn_threads;


class jump extends Thread{
	public void run() {
		System.out.println("Jump Mode is ON...");
	}
}



public class MultiLevel_thrad {

	public static void main(String[] args) {
		
		
		jump t1 = new jump();
		jump t2 = new jump();
		jump t3 = new jump();
		jump t4 = new jump();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		

	}

}
