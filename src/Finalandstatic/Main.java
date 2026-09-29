package Finalandstatic;

public class Main {
public static void main(String[] args) {
	// final
	Finalclass finalclass = new Finalclass();
	finalclass.finalmethod(90);
	

//	finalclass.salary="500";
	
	
	// static
	
	System.out.println(finalclass.salary);
	Staticclass.team();
	System.out.println(Staticclass.message);
	Staticclass.team(20, 10);
	Staticclass t=new Staticclass();
	t.a();
	
	// final static 
	System.out.println(Staticfinal.data);
	Staticfinal.team();

}

}
