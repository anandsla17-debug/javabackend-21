package oops;

public class Calculator {
// add ,sub, div,multi
	
	public Calculator(int data1,int data2){
		System.out.println("constructor:"+(data1+data2));
	}
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	int add( int a,int b) {
		return a+b;
	}
	
	float sub(float a,float b) {
		return a-b;
	}
	
	double div(int a,int b) {
		return a/b;
	}
	
     int multi(int a,int b) {
    	 return a*b;
     }
     
     
     String AddtwoString(String a,String b) {
    	 return a+b;
     }
     
     
     static void message() {
    	 System.out.println("thank you");
     }
	
     
	
}
