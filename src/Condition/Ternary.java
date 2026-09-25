package Condition;

import java.util.Scanner;

public class Ternary {
 Ternary() {
	 Scanner sc= new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
	  String result	=age>=18? "egible to vote":" not egible to vote";
System.out.println(result);
       
      System.out.println("Enter your no");
      int no= sc.nextInt();
      int r= no%2==0? 1:0;
	   
      System.out.println("result 1 is even no and 0 is odd no:"+r);
		
      System.out.println("Enter your name");
      sc.nextLine();
      String name= sc.nextLine();
      int match= name.equals("anand")? 1:0;
     
      System.out.println("name:"+match+name);
      String team="anand";
      
      int m= name==team? 1:0;
      System.out.println(m);
}
}
