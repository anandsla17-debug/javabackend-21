package multithreading;

public class Deadlock {
public static void main(String[] args) {
	ClassA classA=new ClassA();
	ClassB classB=new ClassB();
	Thread t1=new Thread(()->{
		classA.team1(classB);
	});
	Thread t2=new Thread(()->{
		classB.teamB(classA);
	});
	t1.start();
	t2.start();
}
}
