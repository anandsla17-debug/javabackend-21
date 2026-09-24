package oops;

 public interface Interfaces {

  public void add(); //

  
  private void  team() {
	  System.out.println("team");
  }
  
  default void run() {
	System.out.println("run");  
  }
 static void hello() {
	 System.out.println("hello");
 }
  
 
}
