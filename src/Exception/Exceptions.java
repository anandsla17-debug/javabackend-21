package Exception;



public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int arr[]=new int[2];
		arr[0]=30;
		arr[1]=20;
		arr[2]=50;
		for(int data:arr) {
		System.out.println(data);
		}
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		try {
		String name=null;
		System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		
		try {
			String name="anand";
			System.out.println(name.charAt(6));
		}catch (StringIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		try {
	int value=10/0;
	System.out.println(value);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		try {
		String data="10s";
		int no= Integer.valueOf(data);
		System.out.println(no);
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("heello");
		Bank bank= new Bank();
		bank.bank(0);
	}
	
	

}
