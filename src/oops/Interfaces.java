package oops;

 public interface Interfaces {

  public void add(); //

   String name="anand";
  private void  team() {
	  System.out.println("team"+name);
  }
  
  default void run() {
	System.out.println("run"); 
	team();
  }
 static void hello() {
	 System.out.println("hello");
 }
  
 
}
