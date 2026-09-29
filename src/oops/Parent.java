package oops;

public class Parent  extends Calculator{
public Parent(int d1,int d2){
	super(d1, d2);
}

public Parent(int d1,int s3,int d3){
	super(s3, d3);
	
	System.out.println("d3:"+d3);
}
	public Parent() {
	// TODO Auto-generated constructor stub
		super();
}

	void findtotallength( String word) {
		System.out.println("String length:"+word.length());
	}
}
