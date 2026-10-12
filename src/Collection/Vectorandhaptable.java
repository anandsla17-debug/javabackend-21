package Collection;

import java.util.Hashtable;
import java.util.Vector;

public class Vectorandhaptable {

	public void vector() {
		Vector<Integer> term= new Vector<Integer>();
		term.add(10);//0=>10
		term.add(80); //1=80
		term.set(1, 20);//1=20
		term.add(10);//2=10
		System.out.println(term.indexOf(10)); // => first
		System.out.println(term.lastIndexOf(10));
		System.out.println(term);
	}
	
	public void hashtable() {
		Hashtable<Integer, String> student= new Hashtable<Integer, String>();
		student.put(10, "thing");
		student.put(20, "collection");
		student.put(10, "good thing");
		student.remove(10);
		student.remove(20,"collection" );
		student.put(30, "element");
		student.replace(30, "all element");
		student.replace(30, "all element", "things");
		System.out.println(student);
	}
	public static  void main(String[] args) {
		Vectorandhaptable vectorandhaptable= new Vectorandhaptable();
vectorandhaptable.vector();
vectorandhaptable.hashtable();
	}
}
