package typecasting;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// string to int
		
		String word="10";
		int value= Integer.valueOf(word);
		System.out.println(value);
		
		// int to String
		int team=90;
		String data= String.valueOf(team);
		int amount=100;
		System.out.println(data+amount);
		
		// char to String
		char ch='a';
		String chars=String.valueOf(ch);
		System.out.println(chars);
		
		// int to float
		
		int datas=100;
		float point= (float) datas;
		System.out.println(point);
		
		// float to int
		float salary=25000.45f;
		int csalary=(int)salary;
		System.out.println(csalary);
		
		
		
		// String to boolean
		String a="true";
		boolean pass= Boolean.valueOf(a);
		System.out.println(pass);
		
		// int to double
		
		int s=30;
		double s1= Double.valueOf(s);
		
		System.out.println(s1);
		// double to int
		
		double money=12000.84874d;
		int money1=(int)money;
		System.out.println(money1);
		
		// String to double
		
		String fun="1209440.79898";
		double fun1=Double.valueOf(fun);
		System.out.println(fun1);
		
		// String to char
		String s3="a";
		char se= s3.charAt(0);
		System.out.println(se);
		
		//boolean to String
		
		boolean f=true;
		String d= String.valueOf(f);
		System.out.println(d);
		

	}

}
