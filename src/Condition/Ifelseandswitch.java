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


void findindex(String index) {
	 Scanner sc= new Scanner(System.in);
	System.out.println("what index you need give:");
	int indexno=sc.nextInt();
	System.out.println("String index assci:"+index.codePointAt(indexno));
	System.out.println("String index:"+index.charAt(indexno));
}


public void loop()
{
	for(int i=0;i<=10;i++) {
		
		if(i==5) {
			continue;
		}
		
		if(i==9) {
			break;
		}
	System.out.println("repeat"+i);
	System.out.println("thank you");
	
	}
	
	int i=10;
	while (i<20) {
		if(i%2!=0) {
		i++;
			continue;
			
		}
i++;
		System.out.println("i while:"+i);
		
	}
	
	int team=0;
	while(team<20) {
		
	
		System.out.println("team"+(team++));
		
	}
	
	int increament=0;
	while(increament++<10) {
		System.out.println("in"+increament);
	}
	int Decrement=10;
	while(Decrement-->0) {
		System.out.println("d"+Decrement);
	}
	
	// d => 10 to 1 => 6 ( not come)

	
	int[] arr= {10,20,30,40};
//	System.out.println(arr[2]);
	for(int start=0;start<arr.length;start++) {
		System.out.println("normal for"+arr[start]);
	}
	
	// arr en for loop
	for(int arrs:arr) {
		System.out.println(arrs);
	}
	
	String[] s1= {"pen","pencil","scale"};
	
	for(String s2:s1) {
		System.out.println(s2);
	}
	
	
	
	
}

}
