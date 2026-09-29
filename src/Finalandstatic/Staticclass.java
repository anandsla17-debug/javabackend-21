package Finalandstatic;

public class Staticclass {

	static String message="welcome to all";
	
	public void a() {
		System.out.println("team a");
	}
	public static void team() {
		
		message="all";
		System.out.println("static method"+message);
	}
	public static void team(int a,int b) {
		System.out.println("add"+(a+b));
	}
	
	
	static{
		System.out.println("check... static");
	}
}
