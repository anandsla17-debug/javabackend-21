package oops;

import java.util.Scanner;

public class Child extends Parent{
	
	
	Child(int a1,int b2){
		super(a1, b2);
		
	}
	Child (int d1,int d2,int d3){
		super(d1, d2, d3);
	}
Scanner sc= new Scanner(System.in);
	
	void findindex(String index) {
		 
		System.out.println("what index you need give:");
		int indexno=sc.nextInt();
		System.out.println("String index:"+index.charAt(indexno));
	}
}
