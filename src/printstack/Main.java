package printstack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int i=2/0;
		System.out.println(i);
		}catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();//error throw
			System.out.println(e.getMessage());
		}

	}

}
