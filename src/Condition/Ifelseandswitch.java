package Condition;

import java.util.Scanner;

public class Ifelseandswitch {
	
public void ifelse() {
	// if else, switch
	
			// 10 th => 11 th=> bio, cs,ac,pure science,business maths, history
			
			// 400 => bio maths
			// 350 t0 500 => cs
			// 350 to 235 => 
			
			
			
			
			// =>  clg => cutoff
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your mark");
	int mark =sc.nextInt();
	
	if(mark>=400) {
		System.out.println("bio maths");
	}
	else if (mark>=350) {
		System.out.println("computer science");
		
	}
	else if(mark >=235) {
		System.out.println("accounts ,pure science ,history");
	}
	else if(mark <=234 && mark >=0 ) {
		System.out.println("fail");
	}
}


public void switchcase() {
	// calculator => add,sub ,multi div
	int choice=0;
	int result=0;
	Scanner sc= new Scanner(System.in);
	do {
	
	System.out.println("---calculator app---");
	System.out.println("1.add");
	System.out.println("2.sub");
	System.out.println("3.multi");
	System.out.println("4.div");
	System.out.println("0.exit");
	System.out.print("Enter your option:");
	choice=sc.nextInt();
	int value1;
	int value2;
	
	switch(choice) {
	
	case 1:
		System.out.println("--add function");
		System.out.println("Enter value1");
		value1=sc.nextInt();
		System.out.println("Enter value2");
		value2=sc.nextInt();
		
		result=value1+value2;
		System.out.println("add result:"+result);
		break;
		
	case 2:
		System.out.println("--sub function");
		System.out.println("Enter value1");
		value1=sc.nextInt();
		System.out.println("enter value2");
		value2=sc.nextInt();
		result=value1-value2;
		System.out.println("sub result:"+result);
		break;
	case 3:
		System.out.println("--multi function");
		System.out.println("Enter value1");
		value1=sc.nextInt();
		System.out.println("enter value2");
		value2=sc.nextInt();
         result=value1*value2;
         System.out.println("multi result:"+result);
         break;
	case 4:
		System.out.println("--divide function");
	
		System.out.println("Enter value1");
		value1=sc.nextInt();
		System.out.println("enter value2");
		value2=sc.nextInt();
		result= value1/value2;
		if(result%2==0) {
			System.out.println("even result");
			
		}else {
			System.out.println("odd result");
		}
		System.out.println("divide result:"+result);
		break;
	case 0:
		System.out.println("Application is stoped");
		
		break;
		default:
			System.out.println("incorrect opition");
		
	}
	

	
	}while(choice!=0);
	
}
}
