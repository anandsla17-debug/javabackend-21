package multithreading;

public class ClassA {

	synchronized void team1(ClassB classB) {
		System.out.println("thread one");
		classB.B();
	}
	
	 void a() {
		System.out.println("deadlock1");
	}

}
