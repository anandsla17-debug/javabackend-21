package oops;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("class and obj");
		Calculator calculator= new Calculator(89,90);
		System.out.println("add:"+calculator.add(20, 10));
		 int result=calculator.add(4, 7);
		 System.out.println("result:"+result);
		 
		 System.out.println("sub:"+calculator.sub(5.90f, 7.897f));
		 
		 System.out.println("multi:"+calculator.multi(10, 2));
		 System.out.println("div:"+calculator.div(30, 2));
		 System.out.println("add two String:"+calculator.AddtwoString("arun", "kumar"));
		 Calculator.message();
		 
		 System.out.println("constructor");
		 Calculator t= new Calculator(50 ,80);
		 
//		 System.out.println("inhertienance");
//		 Child child= new Child(50,80);
//		 child.findindex("hello world");
//		 child.findtotallength("hello");
		 
//		 System.out.println("polymorphism");
//		 Polymorphism ps= new Polymorphism();
//		 ps.arthimetic();
//		 ps.arthimetic(80,80);
//		 ps.arthimetic(5.90f,89.78f);
//		 ps.arthimetic(9, 9, 90);
		 Childoverride childoverride= new Childoverride();
		 childoverride.game();
		 
		 // encapsulation
		 
//		 Bank_encapsulation bank= new Bank_encapsulation(2336,89,908);
//		 System.out.println("accno:"+bank.getAccno()+",balance:"+bank.getBalance()
//	        +",pin:"+bank.getPin());
//		 bank.setAccno(1234);
//        bank.setBalance(2000);
//        bank.setPin(3426);
//        System.out.println("accno:"+bank.getAccno()+",balance:"+bank.getBalance()
//        +",pin:"+bank.getPin());
		 
		 Bank_encapsulation h= new Bank_encapsulation();
        
		 System.out.println("abstraction class");
		 ExamReg_abstract examreg=new Subexamreg_implement(); 
		 examreg.Reg();
		 examreg.hide();
        
		 
        
		 Interfaces interfaces= new Interfacesimpl();
		 interfaces.add();
	    interfaces.run();
	    Interfaces.hello();
	
		 
		
		 Hide hide = new Interfacesimpl();
		 hide.team("hello student");
		 
	}

}
