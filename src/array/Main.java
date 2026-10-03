package array;

import java.util.Scanner;

public class Main {
	
	public static void main(String [] args) {

		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter your size");
//		int size=sc.nextInt();
//		int[] arr=new int[size];
//		
////		System.out.println(arr.length);
//		
//		
//		
//		
//		for(int i=0; i<arr.length;i++) {
//			
//				
//			
//			System.out.println("enter your data limit is "+arr.length+":"+i);
//			arr[i]=sc.nextInt();
//			}
//		
//		for(int display:arr ) {
//			System.out.println("data:"+display);
//		}
//		
		
		// product => list => 0 to9=> String
		
		//=> 2d array
		
		System.out.println("enter your row size");
		int row= sc.nextInt();
		System.out.println("enter your col size");
		int col=sc.nextInt();
		int [][] data= new int[row][col];
		
//		
//		  data[0][0]=56;
//		  System.out.println(data[0][0]);
		
		for( int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("index:"+"row:"+i+",col:"+j);
				data[i][j] =sc.nextInt();
			}
		}
		
		System.out.println(data.length);
		
		for( int i=0; i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("index:"+"row:"+i+",col:"+j+"="+data[i][j] );
				
			}
		}
	}

}
