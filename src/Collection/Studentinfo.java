package Collection;

import java.util.Objects;

public class Studentinfo {
	
	private String sname;
	
	private int age;
	private String clg;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public Studentinfo(String sname, int age, String clg) {
		super();
		this.sname = sname;
		this.age = age;
		this.clg = clg;
	}
	
	public Studentinfo() {
		
	}
	
	public void display() {
		System.out.println("name:"+sname+",age:"+age+",clg:"+clg);
	}
	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(age), clg, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studentinfo other = (Studentinfo) obj;
		return age == other.age && Objects.equals(clg, other.clg) && Objects.equals(sname, other.sname);
	}
	public String toString() {
		return "name"+sname;
	}
	
	public static void main(String[] args) {
		Studentinfo studentinfo= new  Studentinfo();
		studentinfo.setSname("arun");
		System.out.println(studentinfo);
	}

}
