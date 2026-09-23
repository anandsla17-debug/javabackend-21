package datatypes;

public class Typeofdata {

	void primitive() {
		// primitive data => byte ,short,int,float,double,char,boolean,long
		
				// number 
				// integer
				byte age=100; // -128 to 127
				System.out.println("age:"+age);
				short  noofdays=365;
				System.out.println("noofdays"+noofdays);
				int pin=605111;
		System.out.println(pin);	
		long phone=6374081535L;
		System.out.println(phone);
		    // floating point  => float, double
		float mark =65.90f;
		System.out.println(mark);
		double salary= 250000.909939737887d;
		System.out.println(salary);
		// non -numeric => boolean,char
		boolean pass=true;
		System.out.println(pass);
		char option='a';
		System.out.println(option);

	
	}
	
	void nonprimitive() {
		// non-primitive data=> String , class,interface => hidden, collection=> array,set,map, stack,queue
		
				String name="anand@123^*";
				System.out.println(name);
				
				// collecton => array etc..
				
				
				// add =>10 + 5
				
				int value1=10;
				int value2=5;
				int result=value1+value2;  // 10+15
				
				System.out.println(value1+value2);
				System.out.println("result:"+(value1+value2));
				System.out.println(value1+value2+":result");
				System.out.println("result:"+result);
				System.out.println("results:"+(value1-value2));
	}
	
}
