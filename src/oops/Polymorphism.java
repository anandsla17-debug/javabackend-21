package oops;

import java.util.Scanner;

public class Polymorphism {
	// perform same class
	
	void arthimetic(){
		Scanner sc= new Scanner(System.in);
		System.out.println("value1");
		int a=sc.nextInt();
		System.out.println("value2");
		int b=sc.nextInt();
		
		System.out.println("add:"+(a+b));
	}
	void arthimetic(int a,int b) {
     System.out.println("sub:"+(a-b));		
	}
	
	void arthimetic(int a,int b,int c) {
		System.out.println("total:"+(a+b+c));
	}
	void arthimetic(float a,float b) {
		System.out.println("div:"+a/b);
	}
	
	
}
