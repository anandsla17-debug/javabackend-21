package Collection;

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
	

}
