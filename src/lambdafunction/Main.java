package lambdafunction;

public class Main {
	public static void main(String [] args) {
		
		Interfaces team= (int a,int b)->{
			System.out.println("check... lambda function");
			return a+b;
		};
		
	System.out.println(team.add(20, 30));
	
	
	Multiple mult= (int a,int b)->a*b;
	System.out.println(mult.muli(10, 2));
		
		// it not lamdba function it is defination for interface in main class
//		Interfaces team= new Interfaces() {
//			@Override
//			public void add() {
//				System.out.println("add:"+(60+90));
//			}
//			
//			@Override
//			public void sub() {
//				
//				System.out.println("sub:"+(20-10));
//				
//			}
//		};
//		
//		team.add();
//		team.sub();
	
	// lamdba function =>1 to 10 print 
	}
}
