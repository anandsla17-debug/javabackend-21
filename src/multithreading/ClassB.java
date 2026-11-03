package multithreading;

public class ClassB {
 synchronized void teamB(ClassA classA) {
	 System.out.println("thread two");
	 classA.a();
 }
 void B() {
	 System.out.println("deadlock 2");
 }
 
}
