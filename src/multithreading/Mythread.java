package multithreading;

public class Mythread extends Thread {
	

	void loop(int value) {
		for(int i=1; i<=value;i++) {
			
			
			
				System.out.println("normal method:"+i);
				
			
		}
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
	
			try {
				
				System.out.println("thread method:"+i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}

}
