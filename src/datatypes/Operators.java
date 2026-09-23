package datatypes;

import java.util.Scanner;

public class Operators {
 // arithmetic operators
	Scanner sc = new Scanner(System.in);
	
	void arithmetic() {
		// => + - * / %
		int a=10;
		int b=20;
		System.out.println(a+b);
		
		
		System.out.println("Enter your first no");
		int first=sc.nextInt();
		System.out.println("Enter your Second no");
		int second=sc.nextInt();
		System.out.println("sub:"+(first-second));
		
	}
	
	void addtwoString() {
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		System.out.println("enter your age");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter your clg");
		String clg=sc.nextLine();
		System.out.println(name+age+clg);
	}
	
	void multdivmodules() {
		int a=10,b=2,c=40;
		double d=b/c;
		System.out.println("multi:"+a*b);
		System.out.println("div:"+d);
		System.out.println("modules:"+a%b);
	}
	
	// assignment operators =>+=,-=,*=,/=,=,%=
	public void total() {
		int amount=100;
		amount=50;
		amount+=100;
		amount-=30;
		amount*=2;
		amount/=2;
		amount%=9;
		System.out.println(amount);
	}
	
	// comparsion operator or relational operators => ==,!=,.equals
	public void comparsion() {
		int a=30;
		int b=31;
		System.out.println("value =="+(a==b)); // true or false
		System.out.println("value !="+(a!=b));
		String s1="hello";
		String s2="hello";
		System.out.println("value hello =="+s1==s2);
		
		String a1=new String("hello");
		String a2=new String("hello");
		System.out.println(" object =="+a1==a2);
		System.out.println("object .equals"+a1.equals(a2));
	}
	
	// logical operators
	void  logicaloperator() {
		int a=10;
		int b=20;
		System.out.println("add gate:"+(a<=b && a!=b));
		System.out.println("or gate:"+(a==b || a!=b));
		
	}
	
	//bitwise operators
	void bitwiseoperator() {
	int a=5;// 00110101
	int b=7;// 00110111
	        // 00000010 =>xor
	        // 00110111=> or 
	        // 00110111 => add
	       
	
	String p="7";
	System.out.println(p.codePointAt(0));
		System.out.println("add gate:"+(a&b));
		System.out.println("or gate:"+(a|b));
		System.out.println("xor gate:"+(a^b));
		System.out.println("xor gate:"+(a<=b ^ a!=b));
	}
	
	// increment and decrement operator
	    public void inanddeoperator() {
	    	int a=90;
	    	System.out.println(a++);
	    	System.out.println(a);
	    	System.out.println(++a);
	    	System.out.println(a--);
	    	System.out.println(a);
	    	System.out.println(--a);
	    }
	
	    
	    
//	public static void main(String[] args) {
//		Operators j= new Operators();
//		j.arithmetic();
//	}
}
