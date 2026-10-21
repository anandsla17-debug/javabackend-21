package multithreading;

public class Main {
public static void main(String[] args) throws InterruptedException {
	Mythread mythread= new Mythread();
	
	
	mythread.start();// non syn
	
	Anotherthread anotherthread= new Anotherthread();
	System.out.println("current1:"+mythread.isAlive());
	if(mythread.isAlive()) {
		System.out.println("thread is running");
	}
	Thread thread= new Thread(anotherthread);
	
	thread.start();
	mythread.join();
	System.out.println("current2:"+mythread.isAlive());
	if(mythread.isAlive()) {
		System.out.println("thread is running");
	}
	mythread.loop(10); // syn
	
	System.out.println("thank you...");
	anotherthread.team();
	
}
}
