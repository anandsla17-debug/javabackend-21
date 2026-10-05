package array;

import java.util.Scanner;

public class Main {
	Scanner sc= new Scanner(System.in);
	public void oned() {
		
		System.out.println("Enter your size");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
//		System.out.println(arr.length);
		
		
		
		
		for(int i=0; i<arr.length;i++) {
			
				
			
			System.out.println("enter your data limit is "+arr.length+":"+i);
			arr[i]=sc.nextInt();
			}
		
		for(int display:arr ) {
			System.out.println("data:"+display);
		}
		
		
		// product => list => 0 to9=> String
	}
	
	
	public void twodarry() {
		//=> 2d array
		
				System.out.println("enter your row size");
				int row= sc.nextInt();
				System.out.println("enter your col size");
				int col=sc.nextInt();
				int [][] data= new int[row][col];
				
//				
//				  data[0][0]=56;
//				  System.out.println(data[0][0]);
				
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
	
	public void jaggedarr() {

		int[][] value= new int[3][]; // row => 3
		
		
		for(int i=0;i<value.length;i++) {
			System.out.println("row =>"+(i+1));
			int colsize= sc.nextInt();
			value[i] =new int[colsize];
		}
	
		
//		System.out.println(value.length);
//		System.out.println(value[1].length);
		
		for(int i=0; i<value.length;i++) {
			for(int j=0;j<value[i].length;j++) {
				System.out.println("row:"+i+",col:"+j);
				value[i][j]=sc.nextInt();
				
			}
		}
		
		
		
		for(int[] jagged:value) // 
		{
			
			for(int data1:jagged) {
				System.out.print(data1+" ");
			}
			System.out.println();
		}
		
		//=> string => try 
	}
	public static void main(String [] args) {
Scanner sc= new Scanner(System.in);
	
int [][] []  direct= {
		{
	{2,4,5},
	{5,7,89}
}
,{
	{20,80,78}
	}
};

System.out.println(direct[1][0][1]);
		int[][][] threedarry = new int[2][][];	 // block =>2
		threedarry[0]=new int[2][];// => 1 block => 2row
		threedarry[1]=new int[3][];// 2 block=>3row
		threedarry[0][0]=new int[4];// 1 block => 1 row=> 4 col
		
		
		// =>  all size provide and data store and display
		
		
	
		
		
		
	}
	
	

}
