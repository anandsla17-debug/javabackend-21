package InnerClass;

  public class Outerclass {
public void outermethod() {
	System.out.println("outer class");
}

String name="anand";

  class Inner{
	
	public void	display(){
			System.out.println("inner class");
		}
	}
  static  class Inner1{
	  public  void staticmethod() {
		  System.out.println("direct access");
	  }
  }
  
  class news{
	  String name="arun";
	  news(){
		  System.out.println("inner value"+this.name+"---"+"outer value"+Outerclass.this.name);
	  }
	  news(String name){
		  Outerclass.this.name=name;
		  
	  }
	  
  }
	public static void main(String[] args) {
		
		Outerclass outerclass= new Outerclass();
		outerclass.outermethod();
		Outerclass.Inner inner= outerclass.new Inner();
		inner.display();
		
//		Outerclass.Inner1.staticmethod();// inner class static or not static and inner method static
		
		Outerclass.Inner1 y= new Inner1(); // class static and non static method
		y.staticmethod();
		Outerclass.news t= outerclass.new news("max");
		Outerclass.news u= outerclass.new news();
		
		
	}
}

