package oops;

import java.util.Scanner;

public class Child extends Parent{
	
	
	Child(int a1,int b2){
		super(a1, b2);
		
	}
	
	Child (int d1,int d2,int d3){
		super(d1, d2, d3);
	}
	Child(){
		super();
	}
Scanner sc= new Scanner(System.in);
	
	void findindex(String index) {
		 
		System.out.println("what index you need give:");
		int indexno=sc.nextInt();
		System.out.println("String index assci:"+index.codePointAt(indexno));
		System.out.println("String index:"+index.charAt(indexno));
	}
	
	public void main(String[] args) {
		Child childs= new Child(10,70);
		childs.findindex("hello word");
		
	}
}
