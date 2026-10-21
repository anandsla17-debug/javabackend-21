package multithreading;

public class Threadmain {
public static void main(String[] args) {
	Thread my= new Thread(()->{
		System.out.println("first");
	});
//	my.setPriority(Thread.MIN_PRIORITY);
	
	Runnable myinterface= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("second");
		}
	};
	Thread my1= new Thread(myinterface);
//	my1.setPriority(Thread.MAX_PRIORITY);
	my.start();
	my1.start();
}
}
