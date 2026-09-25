package Condition;

import java.util.Scanner;

public class Conditions {

	public static void main(String [] args) {
		
//		Ternary ternary= new Ternary();
		
		
		// if else, switch
		
		// 10 th => 11 th=> bio, cs,ac,pure science,business maths, history
		
		// 400 => bio maths
		// 350 t0 500 => cs
		// 350 to 235 => 
		
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
		
		
		// =>  clg => cutoff
	}
}
