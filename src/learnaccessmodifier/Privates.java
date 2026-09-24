package learnaccessmodifier;

public class Privates {

	private String thing="pen";
	private void priavtemethod() {
		System.out.println("method");
	}
	
	public void subprivate() {
		priavtemethod();
	}
	public static void main(String[] args) {
		Privates t= new Privates();
		t.priavtemethod();
		System.out.println(t.thing);
	}
}
