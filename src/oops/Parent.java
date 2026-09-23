package oops;

public class Parent  extends Calculator{
Parent(int d1,int d2){
	super(d1, d2);
}

Parent(int d1,int s3,int d3){
	super(s3, d3);
	
	System.out.println("d3:"+d3);
}
	void findtotallength( String word) {
		System.out.println("String length:"+word.length());
	}
}
