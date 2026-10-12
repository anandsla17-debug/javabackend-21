package Exception;

public class Bank {

	
	public void bank(int balance)   {
		
		try {
			if(balance == 0) {
				throw new  ArithmeticException("zero balance");
			}
			else if(balance<500) {
		 throw new Min500expectionrun("must maintain 500 balance"); //message
		}else if(balance <1000) {
			throw new Comptime("error");
		}
		else {
			System.out.println("your is above 500 rs");
		}
		}catch (Min500expectionrun e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch (Comptime e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
	
	
}
