package Twopointer;

public class Twopointer {

	public static void main(String[] args) {
		String value="racedar";
		
		int start=0;
		int end=value.length()-1;
		boolean result=false;
		while(start<end) {
			if(value.charAt(start)!=value.charAt(end)) {
				System.out.println("left:"+ value.charAt(start)+"right:"+value.charAt(end));
				 result=true;
			}
			
			start++;
			end--;
		}
		if(result) {
			System.out.println(" not palindrame");
		}else {
			System.out.println("palindrame");
		}
	}
	
	
	
}
