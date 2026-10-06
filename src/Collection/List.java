package Collection;

import java.util.ArrayList;

public class List {

	// list =>arraylist,linkedlist,vector
	
	
	public void Arraylist() {
		ArrayList<Integer> arraylist= new ArrayList<Integer>();
		
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		
		arraylist.set(0,25);
		arraylist.remove(2);
		arraylist.add(20);
		System.out.println(arraylist.get(1));
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		System.out.println(arraylist.contains(25));
		System.out.println(arraylist.getFirst());
		System.out.println(arraylist.getLast());
		System.out.println(arraylist.isEmpty());
		System.out.println(arraylist.indexOf(20));
		System.out.println(arraylist.lastIndexOf(20));
		arraylist.clear();
		System.out.println(arraylist);
		
	}
	
	public void studentarraylist() {
		
	
		ArrayList<Studentinfo>  student= new ArrayList<Studentinfo>();
		student.add(new Studentinfo("kumar", 20, "tect clg"));
		student.add(new Studentinfo("arun", 23, "abc clg"));
		student.set(0,new Studentinfo("max", 21, "ggg clg"));
		student.set(1, new Studentinfo("jeeva",student.get(1).getAge(),student.get(1).getClg() ));
	
		student.add(new Studentinfo("harish",19,"yyy clg"));
		student.remove(2);
		
		
		
		System.out.println("name:"+student.get(0).getSname()+",age:"+student.get(0).getAge()
				+",clg:"+student.get(0).getClg());
		
		for(Studentinfo s:student) {
			if(s.getSname()=="kumar") {
				s.setSname("max");
			}
			if(s.getAge()==21) {
				s.setAge(0);
				
			}
			s.display();
		}
	}
	
	
	
	public static void main(String[] args) {
		List list= new List();
		list.Arraylist();
		list.studentarraylist();
	}
	
}
