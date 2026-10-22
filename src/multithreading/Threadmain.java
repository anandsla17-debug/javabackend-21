package multithreading;

public class Threadmain {
public static void main(String[] args) {
	Thread my= new Thread(()->{
		System.out.println("first");
	});
	my.setPriority(1);
	
	Runnable myinterface= new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("second");
		}
	};
	Thread my1= new Thread(myinterface);
	my1.setPriority(2);
	
	Thread th1= new Thread(()->{
		System.out.println("third");
	});
	th1.setPriority(3);
	th1.start();
	my.start();
	my1.start();

}
}
