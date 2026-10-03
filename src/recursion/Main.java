package recursion;

public class Main {
	
	public void recursion(int no) {
		if(no ==11) {
			return;// method stop 
		}
		System.out.println(no);
		recursion(no+1);
		
	}
	
	// method => even=> display or odd=> display=> 50  => 51
	
	public static void main(String [] args) {
		Main main= new Main();
		main.recursion(1);
		
	}

}
